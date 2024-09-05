package Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import Bean.Staff_Bean;
import Dao.Staff_Dao;


/**
 * Servlet implementation class Employe_Servlet
 */
@WebServlet(name = "EmployeServlet", urlPatterns = {"/register"})//ulrpattern name = jsp form action name
public class StaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
private Staff_Dao StaffDao;
	
	public void init() {
		StaffDao = new Staff_Dao();
	}
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/NewFile.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("abc");	
		String name = request.getParameter("name");
		String email = request.getParameter("address");
		//int telephone = Integer.getInteger(request.getParameter("telephone")).intValue();
		String password = request.getParameter("password");
		String usertype = request.getParameter("usertype");
		
		Staff_Bean employee = new Staff_Bean();
		employee.setName(name);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setUsertype(usertype);
		
		try {
			StaffDao.InsertUser(employee);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("");
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
