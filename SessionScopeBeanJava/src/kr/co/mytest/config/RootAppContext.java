package kr.co.mytest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.mytest.beans.DataBean1;
import kr.co.mytest.beans.DataBean2;

//프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	@Bean
	@SessionScope
	public DataBean1 dataBean1() {
		return new DataBean1();
	}
	
	@Bean("sessionBean2")
	@SessionScope
	public DataBean2 dataBean2() {
		return new DataBean2();
	}

}
