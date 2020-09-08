package project003.cystudy.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import project003.cystudy.spring5.dao.UserDao;

import javax.annotation.Resource;

//value属性值可以不写，默认是类的首字母小写
@Service(value="userService")
public class UserService {

    @Value(value = "chenyangzuishuai")
    private String name;

//    @Autowired//根据类型进行注入
//    @Qualifier(value = "UserDaoImpl001")
//    private UserDao userDao;

    @Resource(name = "UserDaoImpl001")//根据类型注入
    private UserDao userDao;

    public void add(){
        userDao.add();
        System.out.println("service adding worked");
        System.out.println(name);
    }
}
