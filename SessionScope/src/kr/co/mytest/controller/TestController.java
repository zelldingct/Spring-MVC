package kr.co.mytest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("data1", "문자열1");
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String data1 = (String)session.getAttribute("data1");
		System.out.println(data1);
		
		return "result1";
	}
}
