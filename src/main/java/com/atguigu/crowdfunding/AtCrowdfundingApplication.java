package com.atguigu.crowdfunding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.atguigu.**.dao")
@ComponentScan(basePackages="com.atguigu")
@SpringBootApplication
public class AtCrowdfundingApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(AtCrowdfundingApplication.class, args);
		/*
		SpringApplication application = new SpringApplication(AtCrowdfundingApplication.class, args);
		application.setBannerMode(org.springframework.boot.Banner.Mode.OFF);
		application.run(args);*/
	}
	
	
}
