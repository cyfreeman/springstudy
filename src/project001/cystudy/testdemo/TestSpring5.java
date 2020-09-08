package project001.cystudy.testdemo;

import project001.cystudy.spring5.bean.Employee;
import project001.cystudy.spring5.fondamental.Order;
import project001.cystudy.spring5.fondamental.Orders;
import project001.cystudy.spring5.fondamental.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        //load conf for spring
        ApplicationContext context = new ClassPathXmlApplicationContext("project001/conf001/bean1.xml");

        //get object which build by user config
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testAdd001(){
        //load conf for spring
        BeanFactory context = new ClassPathXmlApplicationContext("project001/conf001/bean1.xml");

        //get object which build by user config
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testAdd002(){
        //load conf for spring
        BeanFactory context = new ClassPathXmlApplicationContext("project001/conf001/bean1.xml");

        //get object which build by user config
        Orders order = context.getBean("orders", Orders.class);
        System.out.println(order);
        order.orderTest();
    }

    @Test
    public void testAdd003(){
        //load conf for spring
        BeanFactory context = new ClassPathXmlApplicationContext("project001/conf001/bean1.xml");

        //get object which build by user config
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        order.orderTest();
    }


    @Test
    public void testAdd004(){
        //load conf for spring
        BeanFactory context = new ClassPathXmlApplicationContext("project001/conf001/bean1.xml");

        //get object which build by user config
        Order order = context.getBean("order001", Order.class);
        System.out.println(order);
        order.orderTest();
    }

    @Test
    public void testAdd005(){
        //load conf for spring
        BeanFactory context = new ClassPathXmlApplicationContext("project001/conf001/bean2.xml");

        //get object which build by user config
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        employee.toString();
    }
    @Test
    public void testAdd006(){
        //load conf for spring
        BeanFactory context = new ClassPathXmlApplicationContext("project001/conf001/bean3.xml");

        //get object which build by user config
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        employee.toString();
    }
}
