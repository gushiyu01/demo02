package com.example.demo02;

import com.example.demo02.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo02ApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testImportResource(){
		Boolean b = ioc.containsBean("service");
		System.out.println(b);
	}

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
