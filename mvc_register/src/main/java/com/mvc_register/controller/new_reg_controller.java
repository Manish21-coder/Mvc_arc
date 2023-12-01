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


@WebServlet("/new_reg")
public class new_reg_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public new_reg_controller() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_Reg.jsp");
			rd.forward(request, response);
		
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   HttpSession session = request.getSession(false);
		   session.setMaxInactiveInterval(10);
     if(session.getAttribute("email")!=null) {
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		Daoimpl service = new Daoimpl();
		service.connectDB();
		boolean status = service.new_register(name, city, email, mobile);
		if(status) {
			
			request.setAttribute("msg","SuccessFully Registerd");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_Reg.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("msg","Not Registred ");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_Reg.jsp");
			rd.forward(request, response);
		}
	}else {
		request.setAttribute("msg","Session Expired! Login again.");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
		   
		   
	}

}
