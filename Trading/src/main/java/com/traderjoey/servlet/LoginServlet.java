package com.traderjoey.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ʱ�������������:
 * 1.��index.jsp���������û������벻Ϊadmin/traderjoey123-,��ص�index.jsp, ���������ݿ����Ӻ�,��ȡ�������û������
 * 2.���û�������Ϊadmin/traderjoey123-,��ͻ�����ת��fan������k��ͼ:query.jsp
 * @author lican
 *
 */
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// FIXME fan
		super.doPost(req, resp);
	}
}
