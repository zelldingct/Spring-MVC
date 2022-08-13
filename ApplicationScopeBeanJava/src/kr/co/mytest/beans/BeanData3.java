package kr.co.mytest.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class BeanData3 {
	private String Data5;
	private String Data6;
	
	public String getData5() {
		return Data5;
	}
	public void setData5(String data5) {
		Data5 = data5;
	}
	public String getData6() {
		return Data6;
	}
	public void setData6(String data6) {
		Data6 = data6;
	}
	
}
