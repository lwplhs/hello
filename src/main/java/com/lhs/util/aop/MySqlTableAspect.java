package com.lhs.util.aop;

import javassist.expr.NewArray;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lhs.service.impl.UserServiceImpl;

@Aspect
@Component
public class MySqlTableAspect {
	
	private static Logger log = LoggerFactory.getLogger(MySqlTableAspect.class);
	
	@Autowired
	private UserServiceImpl userService;
	
	@Before("@annotation(CheckMySqlTable)))")
	public void checklogin() throws Throwable {
		
		userService.creatUser();
		log.info("数据库检查成功");
		
    }
}
