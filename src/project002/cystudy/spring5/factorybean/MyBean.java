package project002.cystudy.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;
import project002.cystudy.spring5.collection.Courses;

public class MyBean implements FactoryBean<Courses> {

    //定义返回bean
    @Override
    public Courses getObject() throws Exception {
        Courses courses = new Courses();
        courses.setCname("CY");
        return courses;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
