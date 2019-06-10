package com.traderjoey.dao;

import java.sql.Timestamp;
import java.util.List;

import com.traderjoey.bean.Currency;
import com.traderjoey.bean.CurrencyPrice;

public interface CurrencyPricesDAO {

	/**
	 * ����ʱʹ��,�����������ݿ�����һ���ж��ٸ��۸���Ŀ
	 * 
	 * @return
	 */
	public int getTotal();

	/**
	 * ����ʱʹ��,�����������ݿ�����ָ������һ���ж��ٸ��۸���Ŀ
	 * 
	 * @return
	 */
	public int getTotal(Currency currency);

	/**
	 * ��ѯָ�����ҵļ۸��б�,����ҳ��ʹ��,�ǳ���Ҫ
	 * 
	 * @param currency
	 * @return
	 */
	public List<CurrencyPrice> list(Currency currency);

	/**
	 * �г���ĳ��ʱ��֮ǰ��,ָ��������,ָ�����ҵļ۸�
	 * 
	 * @param currency
	 * @param start
	 * @param count
	 * @return
	 */
	public List<CurrencyPrice> list(Currency currency, Timestamp end, int count);

	/**
	 * �洢����ʱʹ��,��Ҫ����,Ҳ�ɵ�����,����һ��α���currency,Ӧ��timestamp�����ع���,�����ظ�,�׳��Զ����쳣
	 * 
	 * @param currency
	 */
	public void add(CurrencyPrice currencyPrice);
	
	/**
	 * ɾ��ָ�����ҵ����м۸��¼
	 * @param currency
	 */
	public void delete(Currency currency);

	/**
	 * ɾ����ĳ��ʱ��֮ǰ��,ָ�����ҵļ۸��¼
	 * @param end
	 * @param count
	 */
	public void delete(Timestamp end);
}
