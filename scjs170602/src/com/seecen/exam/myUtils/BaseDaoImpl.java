package com.seecen.exam.myUtils;

import java.util.List;

/**
 * daoʵ����Ĺ�����,ʵ��dao�ӿڹ����࣬����ΪT����
 * 
 * ��û�о���ʵ�֣��Ժ�ѧ��hibernate��ܺ���ʵ��
 * @scjs170602_J2EE
 * @author �����ڡ�
 * @2017��8��25��
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
	/**
	 * ���T����
	 * 
	 * @param t
	 *            T����
	 * @return ��ӳɹ����ظ�T����,ʧ�ܷ���null
	 */
	@Override
	public T add(T t) {
		return null;
	}
	/**
	 * ����T����idɾ��T����
	 * 
	 * @param id
	 *            ����T����idɾ��T����
	 * @return ɾ���ɹ�����Ӱ������,ʧ�ܷ���0
	 */
	@Override
	public Long deleteById(Long id) {
		return null;
	}
	/**
	 * �޸�T����
	 * 
	 * @param t
	 *            T����
	 * @return �޸ĳɹ�����Ӱ������,ʧ�ܷ���0
	 */
	@Override
	public Long update(T t) {
		return null;
	}
	/**
	 * ��ѯ����T����
	 * 
	 * @return ���ز鵽��T����List����
	 */
	@Override
	public List<T> findAll() {
		return null;
	}
	/**
	 * ����id��ѯT����
	 * 
	 * @param id
	 *            T����id
	 * @return ���ҷ��ظ�T����,û�鵽����null
	 */
	@Override
	public T getById(Long id) {
		return null;
	}
	/**
	 * ����id����(���id)��ѯ���T����
	 * @param ids id����
	 * @return ���ҷ���T����List����
	 */
	@Override
	public List<T> getByIds(Long[] ids) {
		return null;
	}
	
}
