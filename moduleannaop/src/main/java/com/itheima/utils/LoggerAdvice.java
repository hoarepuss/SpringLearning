package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component(value = "loggerAdvice")
@Aspect
public class LoggerAdvice {

    @Pointcut(value = "execution(public void com.itheima.service.impl.AccountServiceImpl.saveAccount())")
    public void pt(){

    }

    @AfterReturning("pt()")
    public void beforeLogger(){

        System.out.println("Logger类中的beforeLogger方法开始记录日志了。。。");
    }
    public void afterLogger(){

        System.out.println("Logger类中的afterLogger方法开始记录日志了。。。");
    }
    public void exceptionLogger(){

        System.out.println("Logger类中的exceptionLogger方法开始记录日志了。。。");
    }
    public void finallyLogger(){

        System.out.println("Logger类中的finallyLogger方法开始记录日志了。。。");
    }
    public void aroundLogger(ProceedingJoinPoint pjp){
        try {
            System.out.println("Logger类中的aroundLogger方法开始记录日志了。。。");
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
