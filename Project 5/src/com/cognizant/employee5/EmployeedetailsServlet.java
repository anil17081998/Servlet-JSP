package com.cognizant.employee5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmployeedetailsServlet
 */
@WebServlet("/EmployeedetailsServlet")
public class EmployeedetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeedetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Employee employee = new Employee();
		
		employee.setName("John");
		employee.setId("1");
		employee.setGender("Male");
		employee.setDateOfBirth("17/09/1998");
		employee.setFullTime("ticked");
		employee.setDepartment("Information Technology");
		request.setAttribute("employee", employee);
		RequestDispatcher rd = request.getRequestDispatcher( "EmployeeDetails.jsp");
				rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
