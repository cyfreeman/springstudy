package project006_acid.cystudy.spring5.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project002.cystudy.spring5.autowire.Emp;
import project002.cystudy.spring5.bean.Orders;
import project002.cystudy.spring5.collection.Courses;
import project002.cystudy.spring5.collection.Student;
import project002.cystudy.spring5.factorybean.MyBean;
import project003.cystudy.spring5.config.SpringConfiguration;
import project004.cystudy.spring5.aopannovation.User;
import project004.cystudy.spring5.aopxml.Book;
import project006_acid.cystudy.spring5.config.TxConfig;
import project006_acid.cystudy.spring5.service.UserService;

public class Test {

    @org.junit.Test
    public void test001() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./project006_acid/conf/bean20.xml");
        UserService user = context.getBean("userService", UserService.class);
        user.accountMoney();

    }
    @org.junit.Test
    public void test002() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService user = applicationContext.getBean("userService", UserService.class);
        user.accountMoney();

    }

}
