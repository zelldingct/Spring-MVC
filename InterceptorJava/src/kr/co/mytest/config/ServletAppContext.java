package kr.co.mytest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.mytest.interceptor.TestInterceptor1;
import kr.co.mytest.interceptor.TestInterceptor2;
import kr.co.mytest.interceptor.TestInterceptor3;
import kr.co.mytest.interceptor.TestInterceptor4;
import kr.co.mytest.interceptor.TestInterceptor5;
import kr.co.mytest.interceptor.TestInterceptor6;
import kr.co.mytest.interceptor.TestInterceptor7;

//Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다.
@EnableWebMvc
@ComponentScan("kr.co.mytest.controller")
public class ServletAppContext implements WebMvcConfigurer {
	// Controller의 메소드가 반환하는 jsp의 이름 앞뒹에 경로와 확장자를 붙여주도록 한다.
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	// 정적파일의 경로를 맵핑한다.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}

	// 인터셉터를 등록한다.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);

		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5();
		TestInterceptor6 inter6 = new TestInterceptor6();
		TestInterceptor7 inter7 = new TestInterceptor7();

		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		InterceptorRegistration reg6 = registry.addInterceptor(inter6);
		InterceptorRegistration reg7 = registry.addInterceptor(inter7);

		reg1.addPathPatterns("/test1");
		reg2.addPathPatterns("/test1");
		reg3.addPathPatterns("/test2");
//		reg4.addPathPatterns("/test1");
//		reg4.addPathPatterns("/test2");
		reg4.addPathPatterns("/test1", "/test2");
		reg5.addPathPatterns("/sub1/test3", "/sub1/test4");
		reg6.addPathPatterns("/*");
		reg7.addPathPatterns("/sub1/*");
		reg1.excludePathPatterns("/*");
	}
}
