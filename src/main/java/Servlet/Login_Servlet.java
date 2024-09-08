package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Bean.Login_Bean;
import Dao.Login_Dao;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet(urlPatterns = {"/login"})
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
private Login_Dao LoginDao;
	
	public void init() {
		LoginDao = new Login_Dao();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/Adminlogin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("abc");	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String usertype = request.getParameter("usertype");
		
		Login_Bean login = new Login_Bean();
		login.setEmail(email);
		login.setPassword(password);
		login.setUsertype(usertype);
		
		try {
			System.out.println(login);
			LoginDao.InsertUser(login);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("Customer.jsp");
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}	