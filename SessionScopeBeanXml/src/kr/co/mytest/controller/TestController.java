package kr.co.mytest.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.mytest.beans.DataBean1;
import kr.co.mytest.beans.DataBean2;

@Controller
public class TestController {

	@Autowired
	@Lazy
	DataBean1 sessionBean1;
	
	@Resource(name="sessionBean2")
	@Lazy
	DataBean2 sessionBean2;
	
	@GetMapping("/test1")
	public String test1() {
		
		sessionBean1.setData1("data1");
		sessionBean2.setData3("data3");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1() {
		
		System.out.println(sessionBean1.getData1());
		System.out.println(sessionBean2.getData3());
		
		return "result1";
	}
}
