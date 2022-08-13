package kr.co.mytest.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.mytest.beans.BeanData1;
import kr.co.mytest.beans.BeanData2;
import kr.co.mytest.beans.BeanData3;
import kr.co.mytest.beans.BeanData4;

@Controller
public class TestController {
	
	@Autowired
	BeanData1 applicationBean1;
	
	@Resource(name= "applicationBean2")
	BeanData2 applicationBean2;
	
	@Autowired
	BeanData3 applicationBean3;
	
	@Resource(name= "applicationBean4")
	BeanData4 applicationBean4;
	
	
	@GetMapping("/test1")
	public String test1() {
		
		applicationBean1.setData1("데이터다1");
		applicationBean1.setData2("데이터다2");
		
		applicationBean2.setData3("데이터다3");
		applicationBean2.setData4("데이터다4");
		
		applicationBean3.setData5("데이터다5");
		applicationBean3.setData6("데이터다6");
		
		applicationBean4.setData7("데이터다7");
		applicationBean4.setData8("데이터다8");
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		model.addAttribute("applicationBean1", applicationBean1);
		model.addAttribute("applicationBean2", applicationBean2);
		model.addAttribute("applicationBean3", applicationBean3);
		model.addAttribute("applicationBean4", applicationBean4);
		System.out.println(applicationBean1.getData1());
		System.out.println(applicationBean2.getData3());
		System.out.println(applicationBean3.getData5());
		System.out.println(applicationBean4.getData7());
		return "result1";
	}
}
