package mypcg;

import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ксения on 3/21/2016.
 */
public class BuyDAO implements DAO, Serializable {
    private javax.sql.DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Override
    public List findAll() {
        String sql = "select * from buy;";
        return jdbcTemplate.queryForList(sql);
    }
    @Override
    public int lineCount() {
        String sql = "select count(*) from buy;";
        return jdbcTemplate.queryForObject(sql,Integer.TYPE);
    }
    @Override
    public void deleteLine(int id) {
        String sql = "delete from buy where id =?;";
        jdbcTemplate.update(sql, new Object[] {id});
    }
    @Override
    public void updateTable(String name,int id) {
    }

    public void addLine(int id, java.util.Date buy_date, int store_id, int client_id, int book_id, int amount, double cost)
    {
        String sql = "insert into buy values(?, ?, ?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql,new Object[] {id, buy_date, store_id, client_id, book_id, amount, cost} );
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setDataSource(javax.sql.DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
