package com.example.aop.springaop.service.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Pointcut("executions(* com.example.aop.springaop.controller.*.*(..))")
    public void loggingPointCut(){
        System.out.println("logging aspect for employee class");
    }
}
