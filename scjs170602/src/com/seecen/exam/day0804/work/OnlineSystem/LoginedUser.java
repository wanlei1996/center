package com.seecen.exam.day0804.work.OnlineSystem;

/**
 * ��ǰ��¼�Ļ�Աʵ����(��ǰ��¼��Ա�ĵ�¼��,��ǰ��¼��Ա��VIP���������������,��ǰ��¼��Ա�ĵ�¼״̬)
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class LoginedUser {
	// ��ǰ��¼��Ա�ĵ�¼��
	private String loginName;
	// ��ǰ��¼��Ա��VIP���������������
	private int loginIndex;
	// ��ǰ��¼��Ա�ĵ�¼״̬
	private boolean isLogin;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public int getLoginIndex() {
		return loginIndex;
	}

	public void setLoginIndex(int loginIndex) {
		this.loginIndex = loginIndex;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

}
