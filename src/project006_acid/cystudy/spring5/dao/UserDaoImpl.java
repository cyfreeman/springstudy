package project006_acid.cystudy.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void moneyReduce() {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void moneyAdd() {
        try {
            String sql = "update t_account set money=money+? where username=?";
            jdbcTemplate.update(sql, 100, "mary");
        } catch (DataAccessException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
