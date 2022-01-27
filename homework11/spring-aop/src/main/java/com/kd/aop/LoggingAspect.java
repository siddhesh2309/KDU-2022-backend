package com.kd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.kd.aop.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Order Status:" + arg);
        System.out.println("Before Loggers with Argument");
    }

    @After("execution(* com.kd.aop.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* com.kd.aop.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning " + retVal);
    }

}
