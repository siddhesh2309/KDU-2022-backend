package com.kd.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com.kd.aop..*)")
    public void AuthenticatingPointCut() {

    }

    @Pointcut("within(com.kd.aop..*)")
    public void AuthorizationPointCut() {

    }

    @Before("AuthenticatingPointCut() && AuthorizationPointCut()")
    public void Authenticate() {
        System.out.println("Authenticating the request");
    }

}
