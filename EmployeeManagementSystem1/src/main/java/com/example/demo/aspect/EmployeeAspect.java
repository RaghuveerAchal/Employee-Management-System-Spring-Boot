package com.example.demo.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	@Pointcut("within(com.example.demo.service.EmployeeService)")
	public void op() {}
	@Before("op()")
	public void showDeleteLog() {
		System.out.println("Transaction started........");
	}
	@AfterReturning("op()")
	public void showDeleteadvice() {
		System.out.println("Transaction completed......");
	}
	@AfterThrowing("op()")
	public void showDeletefail() {
		System.out.println("Transaction failed.........");
	}
}
