package com.young.user;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);

//		new SpringApplicationBuilder(UserApplication.class)
//				.web(false) // 非 Web 应用
//				.run(args);
	}
}
