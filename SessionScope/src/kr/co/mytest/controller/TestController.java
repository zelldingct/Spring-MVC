package kr.co.mytest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.mytest.beans.DataBean1;

@Controller
@SessionAttributes("sessionBean1")
public class TestController {
	@ModelAttribute("sessionBean1")
	public DataBean1 sessionBean1() {
		return new DataBean1();
	}

	@GetMapping("/test1")
	//public String test1(HttpServletRequest request) {
	public String test1(HttpSession session) {
		//HttpSession session = request.getSession();
		session.setAttribute("data1", "문자열1123");
		return "test1";
	}
	
	@GetMapping("/result1")
	//public String result1(HttpServletRequest request) {
	public String result1(HttpSession session) {	
	//HttpSession session = request.getSession();
		String data1 = (String)session.getAttribute("data1");
		System.out.println(data1);
		
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpSession session) {
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열232");
		bean1.setData2("문자열3232");
		
		session.setAttribute("bean1", bean1);
		return "test2";
	}
	
	@GetMapping("/result2")
	//public String result2(HttpSession session) {
	public String result2(@SessionAttribute("bean1") DataBean1 bean1) {
	
		//DataBean1 bean1 = (DataBean1)session.getAttribute("bean1");
		System.out.println(bean1.getData1());
		System.out.println(bean1.getData2());
		return "result2";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute("sessionBean1") DataBean1 sessionBean1) {
		sessionBean1.setData1("아무거나1");
		sessionBean1.setData2("아무거나2");
		
		return "test3";
	}
	
	@GetMapping("/result3")
	public String result3(@ModelAttribute("sessionBean1") DataBean1 sessionBean1) {
		System.out.println(sessionBean1.getData1());
		System.out.println(sessionBean1.getData2());
		
		return "result3";
		
	}
	
}
