package com.mvc_register.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc_register.model.Daoimpl;


@WebServlet("/Del_reg")
public class delete_reg_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public delete_reg_controller() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		String email = request.getParameter("email");			
		
		request.setAttribute("email", email);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Delete.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	        HttpSession session = request.getSession(false);
	        session.setMaxInactiveInterval(10);
	        if(session.getAttribute("email")!=null) {
	        	
		String email = request.getParameter("email");		
		Daoimpl service = new Daoimpl();
		service.connectDB();
		service.delete_register(email);
					
			ResultSet res =  service.read_register();
			request.setAttribute("res", res);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/read.jsp");
			rd.forward(request, response);
	}else {
		request.setAttribute("msg","Session Expired! Login again.");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	}
}
