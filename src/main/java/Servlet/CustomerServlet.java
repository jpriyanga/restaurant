package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Bean.Customer_Bean;
import Dao.Customer_Dao;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet( urlPatterns = {"/reservation"})
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
private Customer_Dao CustomerDao;
	
	public void init() {
		CustomerDao = new Customer_Dao();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/Reservation.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("abc");	
		String servicetype = request.getParameter("servicetype");
		String dateandtime = request.getParameter("dateandtime");
		System.out.println(dateandtime);	

		
		Customer_Bean reservation = new Customer_Bean();
		reservation.setServiceType(servicetype);
		reservation.setDateandTime(dateandtime);
		
		
		try {
			System.out.println(reservation);
			CustomerDao.InsertUser(reservation);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("Response.jsp");
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
