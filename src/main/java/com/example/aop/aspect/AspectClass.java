package com.example.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AspectClass {

    @Before("@annotation(com.example.aop.aspect.MyAnno)")
    public void logWebServiceCall(JoinPoint thisJoinPoint) {
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArgs = thisJoinPoint.getArgs();

        log.info("Call method {} with args {}", methodName, methodArgs);
//    Object result = thisJoinPoint.proceed();
//    log.info("Method {} returns {}", methodName, result);
    }

}
