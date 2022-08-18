package kr.co.mytest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

	
	
	public String testDaoMethod() {
		return "문자열";
	}
}
