package com.seecen.exam.myUtils;

import java.util.List;
/**
 * dao�ӿڵĹ�����
 * @author wanlei
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * ���T����
	 * 
	 * @param t
	 *            T����
	 * @return ��ӳɹ����ظ�T����,ʧ�ܷ���null
	 */
	public T add(T t);

	/**
	 * ����T����idɾ��T����
	 * 
	 * @param id
	 *            ����T����idɾ��T����
	 * @return ɾ���ɹ�����Ӱ������,ʧ�ܷ���0
	 */
	public Long deleteById(Long id);

	/**
	 * �޸�T����
	 * 
	 * @param t
	 *            T����
	 * @return �޸ĳɹ�����Ӱ������,ʧ�ܷ���0
	 */
	public Long update(T t);

	/**
	 * ��ѯ����T����
	 * 
	 * @return ���ز鵽��T����List����
	 */
	public List<T> findAll();

	/**
	 * ����id��ѯT����
	 * 
	 * @param id
	 *            T����id
	 * @return ���ҷ��ظ�T����,û�鵽����null
	 */
	public T getById(Long id);
	/**
	 * ����id����(���id)��ѯ���T����
	 * @param ids id����
	 * @return ���ҷ���T����List����
	 */
	public List<T> getByIds(Long[] ids);
}
