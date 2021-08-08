package yatospace.etf.ip.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yatospace.etf.ip.bean.LogonBean;

/**
 * Servlet implementation class AuthenticationController
 */
@WebServlet("/Controller")
public class AuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthenticationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		LogonBean logonBean = (LogonBean) request.getSession().getAttribute("logonBean");
		if(logonBean==null) request.getSession().setAttribute("logonBean", logonBean = new LogonBean());
		String path = request.getParameter("page"); 
		if(path==null) path = "";
		loginResolve(request, response, logonBean);
		logoutResolve(request, response, logonBean); 
		switch(path.intern()) {
			case "login.jsp":
				if(logonBean.isLogged()) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/logout.jsp"); 
					dispatcher.forward(request, response);
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp"); 
					dispatcher.forward(request, response);
				}
				break;
			case "logout.jsp":
				if(logonBean.isLogged()) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/logout.jsp"); 
					dispatcher.forward(request, response);
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp"); 
					dispatcher.forward(request, response);
				}
				break;
			case "quest.jsp":
				if(logonBean.isLogged()) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/logout.jsp"); 
					dispatcher.forward(request, response);
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/quest.jsp"); 
					dispatcher.forward(request, response);
				}
				break;
			default: 
				response.sendError(404, "Resource not found.");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void loginResolve(HttpServletRequest request, HttpServletResponse response, LogonBean logonBean) {
		if(request.getParameter("login_submit") != null) {
			String username = request.getParameter("username"); 
			if(username==null) username = "";
			logonBean.setUsername(username); 
		}
	}
	
	public void logoutResolve(HttpServletRequest request, HttpServletResponse response, LogonBean logonBean) {
		if(request.getParameter("logout_submit") != null) {
			logonBean.resetUsername(); 
		}
	}
}
