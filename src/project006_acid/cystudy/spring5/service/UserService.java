package project006_acid.cystudy.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project006_acid.cystudy.spring5.dao.UserDao;

@Service
@Transactional()
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney() {
            userDao.moneyReduce();
            int i = 1/0;//异常
            userDao.moneyAdd();
    }
}
