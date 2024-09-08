package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import Bean.Admin_Bean;
import Dao.Admin_Dao;

/**
 * Servlet implementation class Admin_Servlet
 */

@WebServlet(urlPatterns = {"/adminlogin"})
public class Admin_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
private Admin_Dao AdminDao;
	
	public void init() {
		AdminDao = new Admin_Dao();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_Servlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Admin_Bean adminlogin = new Admin_Bean();
		adminlogin.setUsername(username);
		adminlogin.setPassword(password);
		
		try {
			System.out.println(adminlogin);
			AdminDao.InsertUser(adminlogin);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("Admin.jsp");
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}	
