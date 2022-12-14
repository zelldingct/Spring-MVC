package kr.co.mytest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mytest.model.Test2Service;

@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청한 주소를 가져온다.
		
		String url = request.getRequestURI();
		String abc = String.valueOf(url);
		String viewName =null;
		
		if (url.contains("main.mvc")) {
			//System.out.println("main 요청");
			viewName = "main.jsp";
			System.out.println(viewName);
		} else if (url.contains("test1.mvc")) {
			//파라미터 데이터 추출
			String str1 = request.getParameter("data1");
			String str2 = request.getParameter("data2");
			int number1 = Integer.parseInt(str1);
			int number2 = Integer.parseInt(str2);
			
			int result = number1 + number2;
			request.setAttribute("abc", result);
		
			
			viewName = "test1.jsp";
			System.out.println(url);
			System.out.println(str1);
			System.out.println(number1);
			System.out.println(request);
		} else if (url.contains("test2.mvc")) {
			
			int result = Test2Service.minus(request);
			request.setAttribute("abc", result);
			
			viewName = "test2.jsp";
		} else if (url.contains("test.mvc")) {
			viewName = "test.jsp";
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher(viewName);
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);
	}

}
