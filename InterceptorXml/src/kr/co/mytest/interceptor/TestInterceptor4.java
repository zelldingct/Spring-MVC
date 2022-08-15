package kr.co.mytest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor4 implements HandlerInterceptor{

	//Controller의 메서드가 호출되기전에 호출된다.
		//false를 반환하면 요청 처리에 대한 진행이 중단된다.
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
			System.out.println("TestInterceptor4 - preHandler");
			return true;
		}
		
		//Controller의 메서드가 호출되고 난 후에 호출된다.
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			
			System.out.println("TestInterceptor4 - postHandler");
		}
		
		//view 처리까지 완료되면 호출된다.
		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
				throws Exception {
			System.out.println("TestInterceptor4 - afterCompletion");
		}

}
