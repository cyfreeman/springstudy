package project002.cystudy.spring5.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project002.cystudy.spring5.autowire.Emp;
import project002.cystudy.spring5.bean.Orders;
import project002.cystudy.spring5.collection.Book;
import project002.cystudy.spring5.collection.Courses;
import project002.cystudy.spring5.collection.Student;
import project002.cystudy.spring5.factorybean.MyBean;

public class Test {

    @org.junit.Test
    public void test001(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean11.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student.toString());
    }
    @org.junit.Test
    public void test002(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean12.xml");

        Book book = applicationContext.getBean("books", Book.class);
        Book book001 = applicationContext.getBean("books", Book.class);
        System.out.println(book.hashCode());
        System.out.println(book001.hashCode());
        System.out.println(book.toString());
    }

    @org.junit.Test
    public void test003(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean13.xml");

        MyBean myBean = applicationContext.getBean("mybean", MyBean.class);
        System.out.println(myBean.toString());
    }
    @org.junit.Test
    public void test004(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean13.xml");

        Courses myBean = applicationContext.getBean("mybean", Courses.class);
        System.out.println(myBean.toString());
    }

    @org.junit.Test
    public void test005(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean14.xml");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean14.xml");
        Orders orders = classPathXmlApplicationContext.getBean("orders", Orders.class);
        System.out.println("fourth step : get bean examples");
        System.out.println(orders.toString());

        classPathXmlApplicationContext.close();
    }

    @org.junit.Test
    public void test006(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean14.xml");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("./project002/conf002/bean15.xml");
        Emp emp = classPathXmlApplicationContext.getBean("emp", Emp.class);
        System.out.println(emp.toString());

    }

}
