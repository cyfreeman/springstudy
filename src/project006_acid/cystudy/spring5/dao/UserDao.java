package project006_acid.cystudy.spring5.dao;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    public void moneyReduce();

    public void moneyAdd();
}
