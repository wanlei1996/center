package com.seecen.exam.day0807;


/**
 * Registerҵ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class RegisterBiz {

	/**
	 * У������������Ƿ�Ϸ�
	 * @param register ���ݶ���
	 * @return int 1�Ϸ�  2���֤���� 3 �ֻ��Ŵ��� 4�����Ŵ���
	 */
	public int checkInput(Register register) {
		boolean idCardHefa = checkId(register.getIdCard());
		if(!idCardHefa) return 2;
		boolean phoneHefa = checkPhone(register.getPhone());
		if(!phoneHefa) return 3;
		boolean telHefa = checkTel(register.getTel());
		if(!telHefa) return 4;
		
		return 1;
	}
	/**
	 * �����������
	 * @param tel ��������
	 * @return ��ȷ����true�����󷵻�false
	 */
	private boolean checkTel(String tel) {
		int index = tel.indexOf("-");
		if(index != 4) {
			return false;
		}
		String houmian = tel.substring(index + 1);	
		if(houmian.length() != 8) {
			return false;
		}
		return true;
	}
	/**
	 * ����ֻ�����
	 * @param phone �ֻ�����
	 * @return ��ȷ����true�����󷵻�false
	 */
	private boolean checkPhone(String phone) {
		return phone.length() == 11 ? true : false;
	}
	/**
	 * ������֤����
	 * @param idCard ���֤����
	 * @return ��ȷ����true�����󷵻�false
	 */
	private boolean checkId(String idCard) {
		if(idCard.length() == 16 || idCard.length() == 18 ) {
			return true;
		}
		return false;
	}

}
