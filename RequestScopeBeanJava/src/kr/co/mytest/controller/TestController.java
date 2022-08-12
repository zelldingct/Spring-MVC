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
		DataBean1 requestBean1;
		
		@Resource(name = "requestBean2")
		DataBean2 requestBean2;
		
		@Autowired
		DataBean3 requestBean3;
		
		@Resource(name = "requestBean4")
		DataBean4 requestBean4;
		
		@GetMapping("/test1")
			public String test1() {
			requestBean1.setData1("문자열1");
			requestBean1.setData2("문자열2");
			
			requestBean2.setData3("문자열3");
			requestBean2.setData4("문자열4");
			
			requestBean3.setData5("문자열5");
			requestBean4.setData7("문자열7");
			
			return "forward:/result1";
		}
		
		@GetMapping("/result1")
			public String result1(Model model) {
			System.out.println(requestBean1.getData1());
			System.out.println(requestBean2.getData3());
			System.out.println(requestBean3.getData5());
			System.out.println(requestBean4.getData7());
			
			
			model.addAttribute("requestBean1", requestBean1);//(test1에서 생성된 requestBean1을 저장해준다.)
			model.addAttribute("requestBean2", requestBean2);
			model.addAttribute("requestBean3", requestBean3);
			model.addAttribute("requestBean4", requestBean4);
			return "result1";
		}
}
