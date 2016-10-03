package com.ex.machina.hw.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

	@Before("execution(* com.ex.machina.hw.service.LMSService.findById(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.info(String.format("Calling %s with args %s", joinPoint.getSignature().getName(), joinPoint.getArgs()));
	}
}
