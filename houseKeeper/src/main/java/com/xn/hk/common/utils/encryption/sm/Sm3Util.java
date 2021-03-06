package com.xn.hk.common.utils.encryption.sm;

import java.util.Arrays;

import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * 
 * @ClassName: SM3Util
 * @Package: com.xn.hk.common.utils.encryption.sm
 * @Description: sm3算法工具类
 * @Author: wanlei
 * @Date: 2020年8月24日 上午11:52:57
 */
public class Sm3Util extends SmBaseUtil {
	/**
	 * sm3算法摘要
	 * 
	 * @param srcData
	 * @return
	 */
	public static byte[] hash(byte[] srcData) {
		SM3Digest digest = new SM3Digest();
		digest.update(srcData, 0, srcData.length);
		byte[] hash = new byte[digest.getDigestSize()];
		digest.doFinal(hash, 0);
		return hash;
	}

	/**
	 * sm3算法验证摘要
	 * 
	 * @param srcData
	 * @return
	 */
	public static boolean verify(byte[] srcData, byte[] sm3Hash) {
		byte[] newHash = hash(srcData);
		if (Arrays.equals(newHash, sm3Hash)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * sm3和Mac地址摘要
	 * 
	 * @param key
	 * @param srcData
	 * @return
	 */
	public static byte[] hmac(byte[] key, byte[] srcData) {
		KeyParameter keyParameter = new KeyParameter(key);
		SM3Digest digest = new SM3Digest();
		HMac mac = new HMac(digest);
		mac.init(keyParameter);
		mac.update(srcData, 0, srcData.length);
		byte[] result = new byte[mac.getMacSize()];
		mac.doFinal(result, 0);
		return result;
	}
}
