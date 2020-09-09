package project004.cystudy.spring5.aopannovation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//enhance
@Component
@Aspect//生成代理对象
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* project004.cystudy.spring5.aopannovation.User.add(..))")
    public void pointdemo() {

    }

    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before.........");
    }

    @After(value = "pointdemo()")
    public void after() {
        System.out.println("after.........");
    }
    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("AfterReturning.........");
    }

    //异常通知
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("AfterThrowing.........");
    }
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around pre.........");
        proceedingJoinPoint.proceed();
        System.out.println("around after.........");
    }
}
