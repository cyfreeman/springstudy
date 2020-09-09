package project004.cystudy.spring5.service;

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add method executed");
        return a+b;
    }

    @Override
    public String update(String ID) {
        System.out.println("update method executed");
        return ID;
    }
}
