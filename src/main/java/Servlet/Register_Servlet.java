package Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import Bean.Register_Bean;
import Dao.Register_Dao;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet( urlPatterns = {"/registration"})
public class Register_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
private Register_Dao RegisterDao;
	
	public void init() {
		RegisterDao = new Register_Dao();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/Registration.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("abc");	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		System.out.println(email);	
		String password = request.getParameter("password");
		String usertype = request.getParameter("usertype");
		
		Register_Bean register = new Register_Bean();
		register.setName(name);
		register.setEmail(email);
		register.setPassword(password);
		register.setUsertype(usertype);
		
		try {
			System.out.println(register);
			RegisterDao.InsertUser(register);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("NewFile.jsp");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("NewFile.jsp");
//		dispatcher.forward(request, response);
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
