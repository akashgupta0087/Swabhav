package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

/**
 * Servlet implementation class EditStudentController
 */
@WebServlet("/editStudent")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Student student;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudentController() {
    	System.out.println("EditStudent servlet created");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("studentId");
	StudentService service = StudentService.getInstance();
	student = service.getStudent(id);
	
	request.setAttribute("student", student);
	
	HttpSession session = request.getSession();
	if (session.getAttribute("loggedIn") != null) {
		RequestDispatcher view = request.getRequestDispatcher("view/editStudent.jsp");
		view.forward(request, response);
	}
	else {
		response.sendRedirect("login");
	};
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollNoValue = request.getParameter("rollNo");
		String ageValue = request.getParameter("age");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		
		if(rollNoValue!="" && ageValue!="" && name!="" && email!="") {
			int rollNo = Integer.parseInt(rollNoValue);
			int age = Integer.parseInt(ageValue);
			StudentService service = StudentService.getInstance();
			service.updateStudent(student,rollNo, name, age, email);
			response.sendRedirect("students");
		}
		
		else {
			request.setAttribute("student", student);
			request.setAttribute("message", "All the fields should be filled");
			
			RequestDispatcher view = request.getRequestDispatcher("view/editStudent.jsp");
			view.forward(request, response);
		}
	}

}
