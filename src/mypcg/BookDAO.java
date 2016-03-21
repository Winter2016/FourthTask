package mypcg;

import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ксения on 3/21/2016.
 */
public class BookDAO implements DAO, Serializable{
    private javax.sql.DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Override
    public List findAll() {
        String sql = "select * from book;";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public int lineCount() {
        String sql = "select count(*) from book;";
        return jdbcTemplate.queryForObject(sql,Integer.TYPE);
    }

    @Override
    public void deleteLine(int id) {
        String sql = "delete from book where id =?;";
        jdbcTemplate.update(sql, new Object[] {id});
    }

    @Override
    public void updateTable(String name,int id) {
        String sql = "update book set title =? where id =?;";
        jdbcTemplate.update(sql,new Object[] {name, id} );
    }

    public void addLine(int id, String title, double cost,String storehouse, int amount)
    {
        String sql = "insert into book values(?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql,new Object[] {id, title, cost, storehouse, amount} );
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setDataSource(javax.sql.DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
