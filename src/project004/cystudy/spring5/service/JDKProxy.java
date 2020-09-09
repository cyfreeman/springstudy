package project004.cystudy.spring5.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(6, 66);
        System.out.println("result: " + result);
    }
}

class UserDaoProxy implements InvocationHandler {

    //1、把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递

    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("before method execute " + method.getName()+" : export parameters: "+ Arrays.toString(args));
        //被增强的方法执行
        Object response = method.invoke(obj, args);
        //方法之后
        System.out.println("after method execute :——>" + obj);
        return response;
    }
}