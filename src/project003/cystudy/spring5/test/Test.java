package project003.cystudy.spring5.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project002.cystudy.spring5.autowire.Emp;
import project002.cystudy.spring5.bean.Orders;
import project002.cystudy.spring5.collection.Book;
import project002.cystudy.spring5.collection.Courses;
import project002.cystudy.spring5.collection.Student;
import project002.cystudy.spring5.factorybean.MyBean;
import project003.cystudy.spring5.config.SpringConfiguration;
import project003.cystudy.spring5.service.UserService;

public class Test {

    @org.junit.Test
    public void test001(){
        ApplicationContext context = new ClassPathXmlApplicationContext("./project003/conf/bean20.xml");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @org.junit.Test
    public void test002(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
