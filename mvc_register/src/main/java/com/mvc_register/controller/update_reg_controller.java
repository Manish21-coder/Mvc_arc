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


@WebServlet("/updte_reg")
public class update_reg_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public update_reg_controller() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String mobile = request.getParameter("mob");
		request.setAttribute("email",email);
		request.setAttribute("mob",mobile);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/update.jsp");
			rd.forward(request, response);
	
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	                HttpSession session = request.getSession();
	                session.setMaxInactiveInterval(10);
	        if(session.getAttribute("email")!=null){
	        	
	                
		String email = request.getParameter("email");		
		String mobile = request.getParameter("mobile");		
		
		Daoimpl service = new Daoimpl();
		service.connectDB();
		boolean status = service.update_register(email, mobile);
		
		if(status) {
			
		
			ResultSet res =  service.read_register();
			request.setAttribute("res", res);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/read.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("msg","Update Failed ");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/update.jsp");
			rd.forward(request, response);
		}
	        }else {
	        	request.setAttribute("msg","Session Expired! Login again.");
	    		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	    		rd.forward(request, response);
	        }
	}

}
