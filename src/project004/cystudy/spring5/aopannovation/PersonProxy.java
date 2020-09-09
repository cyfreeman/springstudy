package project004.cystudy.spring5.aopannovation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* project004.cystudy.spring5.aopannovation.User.add(..))")
    public void afterReturning() {
        System.out.println("person before.........");
    }
}
