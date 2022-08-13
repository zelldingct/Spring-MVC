package kr.co.mytest.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.mytest.beans.DataBean1;
import kr.co.mytest.beans.DataBean2;
import kr.co.mytest.beans.DataBean3;
import kr.co.mytest.beans.DataBean4;

@Controller
public class TestController {

	@Autowired
	DataBean1 sessionBean1;
	
	@Resource(name="sessionBean2")
	DataBean2 sessionBean2;
	
	@Autowired
	DataBean3 sessionBean3;
	
	@Resource(name="sessionBean4")
	DataBean4 sessionBean4;
	
	@GetMapping("/test1")
	public String test1() {
		
		sessionBean1.setData1("data1");
		sessionBean2.setData3("data3");
		sessionBean3.setData5("data5");
		sessionBean4.setData7("data7");
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		model.addAttribute("sessionBean1", sessionBean1);
		model.addAttribute("sessionBean2", sessionBean2);
		model.addAttribute("sessionBean3", sessionBean3);
		model.addAttribute("sessionBean4", sessionBean4);
		
		System.out.println(sessionBean1.getData1());
		System.out.println(sessionBean2.getData3());
		System.out.println(sessionBean3.getData5());
		System.out.println(sessionBean4.getData7());
		
		return "result1";
	}
	
	
}
