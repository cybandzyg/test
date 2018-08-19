package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		Integer i = 1;
		Integer j = 1;
		String a = new String("a");
		String b = new String("a");
		System.out.println(i==j);
		System.out.println(a==b);
	}
	

}
