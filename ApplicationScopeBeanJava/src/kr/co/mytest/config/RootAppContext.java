package kr.co.mytest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import kr.co.mytest.beans.BeanData1;
import kr.co.mytest.beans.BeanData2;

//프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	@Bean
	@ApplicationScope
	public BeanData1 applicationBean1() {
		return new BeanData1();
	}
	
	@Bean("applicationBean2")
	@ApplicationScope
	public BeanData2 applicationBean2() {
		return new BeanData2();
	}
}
