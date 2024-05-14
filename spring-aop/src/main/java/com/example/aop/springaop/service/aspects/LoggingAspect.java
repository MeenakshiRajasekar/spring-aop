package com.example.aop.springaop.service.aspects;


import com.example.aop.springaop.service.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Pointcut("execution(* com.example.aop.springaop.controller.*.*(..))")
    public void loggingPointCut(){
        System.out.println("logging aspect for employee class");
    }

    @Before("loggingPointCut()")
    public void before(JoinPoint joinPoint){
        log.info("Before method invoked: " +joinPoint.getSignature());
        log.info("Before method args "+ joinPoint.getArgs());
    }

    @After("loggingPointCut()")
    public void after(JoinPoint joinPoint){

        log.info("Before method args "+ joinPoint.getArgs());
    }

    @AfterReturning(value="execution(* com.example.aop.springaop.controller.*.*(..))", returning = "employee")
    public void afterReturning(JoinPoint joinPoint, Employee employee){
        log.info("after returning::" +employee);
    }

}
