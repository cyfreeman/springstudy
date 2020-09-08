package project003.cystudy.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "UserDaoImpl001")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add fun worked");
    }
}
