package com.traderjoey.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckLoginFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * Ϊ�˱��������ƹ�������ƵĻ���:�����¼������,����˴�filter���ڼ�鵱ǰ�û�:
	 * 1.�����Ϊ�ǿ�,�򲻲�ȡ�κ��ж�
	 * 2.�����Ϊ��,��鵱ǰ����jsp��β��url,������url������index.jsp����register.jsp��β,��ʹ�ÿͻ�����ת��index.jsp
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// FIXME fan
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
