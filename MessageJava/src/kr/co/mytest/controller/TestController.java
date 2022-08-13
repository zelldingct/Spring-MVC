package kr.co.mytest.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/test1")
	public String test1(Model model, Locale locale) {
		
		System.out.println(locale);
		String a1 = res.getMessage("aaa.a1", null,null);
		String b1 = res.getMessage("bbb.b1", null,null);
		
	
		
		
		// {} 부분에 셋팅할 값 배열
		Object[] args = {30, "홍길동"};
		String a2 = res.getMessage("aaa.a2", args, null);
		model.addAttribute("args", args);
		
		String a3 = res.getMessage("aaa.a3",null, locale);
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(a2);
		System.out.println(a3);
		
		return "test1";
	}
}
