package com.mvc_register.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc_register.model.Daoimpl;


@WebServlet("/auth_login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	String user = 	request.getParameter("username");
		String pass = request.getParameter("password");
		
		Daoimpl  service= new Daoimpl();
		service.connectDB();
		boolean status = service.verifyLogin(user, pass);
		
		
		if(status) {
			
		     HttpSession session = request.getSession(true);
		     session.setAttribute("email", user);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/menu.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("msg", "invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
		}
	}

}
