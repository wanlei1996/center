package com.seecen.exam.day0807;


/**
 * �û�ҵ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class UserBiz {
	/**
	 * �û���¼
	 * @param us �û���������
	 * @param name �û���
	 * @param pwd ����
	 * @return ��¼�ɹ�����true,���򷵻�false
	 */
	public boolean login(User[] users,String name,String pwd){
		for (User u : users) {
			if(name.equals(u.getName())&&pwd.equals(u.getPwd())){
				return true;
			}
		}
		return false;
	}
}
