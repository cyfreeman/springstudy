package project004.cystudy.spring5.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project002.cystudy.spring5.autowire.Emp;
import project002.cystudy.spring5.bean.Orders;
import project002.cystudy.spring5.collection.Courses;
import project002.cystudy.spring5.collection.Student;
import project002.cystudy.spring5.factorybean.MyBean;
import project003.cystudy.spring5.config.SpringConfiguration;
import project003.cystudy.spring5.service.UserService;
import project004.cystudy.spring5.aopannovation.User;
import project004.cystudy.spring5.aopxml.Book;

public class Test {

    @org.junit.Test
    public void test001() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./project004/conf/bean20.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }

    @org.junit.Test
    public void test002() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./project004/conf/bean21.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();

    }
}
