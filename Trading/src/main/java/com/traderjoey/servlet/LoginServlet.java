package com.traderjoey.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �����������û�,���������ݿ����Ӻ�,��ȡ�������û������:
 * 1.admin/traderjoey123-
 * 2.root/traderjoey123-
 * 
 * ��ʱ�������������:
 * 1.��index.jsp���������û������벻ƥ������û�,��ص�index.jsp
 * 2.���û�������ƥ������û�,��ͻ�����ת��fan������k��ͼ:query.jsp
 * 
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
