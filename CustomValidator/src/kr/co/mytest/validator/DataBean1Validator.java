package kr.co.mytest.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import kr.co.mytest.beans.DataBean1;

public class DataBean1Validator implements org.springframework.validation.Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return DataBean1.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "data2", "error2");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data3", "error3");
		
		DataBean1 bean1 = (DataBean1)target;
		
		String data2 = bean1.getData2();
		String data3 = bean1.getData3();
		
		if(data2.length()>10) {
			errors.rejectValue("data2", "error4");
		}
		
		if(data3.contains("@")==false) {
			errors.rejectValue("data3", "error5");
		}
		
	}


	
}
