package com.traderjoey.dao;

import com.traderjoey.bean.User;

public interface UserDAO {
	/**
	 * ��ǰ��ע�����ʱʹ��,���������ó�ʼbalanceΪ100000��
	 * @param bean
	 */
	public void add(User bean);

	/**
	 * ��ǰ���ж��û��Ƿ��Ѿ����ڵĲ���
	 * @param name
	 * @return
	 */
	public boolean isExist(String name);

	/**
	 * ��ǰ�˻�ȡ�û��Ĳ���
	 * @param name
	 * @return
	 */
	public User get(String name);

	/**
	 * ��ǰ�˻�ȡ�û�����ĺ���ʽ
	 * @param name
	 * @param password
	 * @return
	 */
	public User get(String name, String password);

}
