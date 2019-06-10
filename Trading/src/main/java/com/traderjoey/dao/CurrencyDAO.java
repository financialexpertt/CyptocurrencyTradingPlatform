package com.traderjoey.dao;

import com.traderjoey.bean.Currency;
import com.traderjoey.bean.CurrencyPrice;

public interface CurrencyDAO {
	/**
	 * ���¶�����ɾ�Ĳ�
	 * 
	 */
	public void add(Currency currency);

	public void delete(Currency currency);

	public void update(Currency currency);

	public void get(Currency currency);
	
	/**
	 * ��apiԶ��ȡ�������µļ۸�֮��,��ֹҪ��CurrencyPrices���������,��Ҫ���������
	 * @param currencyPrice
	 */
	public void setMostRecentPrice(CurrencyPrice currencyPrice);

}
