package mypcg.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.util.List;;

/**
 * Created by Ксения on 3/20/2016.
 */
public class ClientDAO implements DAO, Serializable {
    private javax.sql.DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Override
    public List findAll() {
        String sql = "select * from client;";
        return jdbcTemplate.queryForList(sql);
    }
    @Override
    public int lineCount() {
        String sql = "select count(*) from client;";
        return jdbcTemplate.queryForObject(sql,Integer.TYPE);
    }
    @Override
    public void deleteLine(int id) {
        String sql = "delete from client where id =?;";
        jdbcTemplate.update(sql, new Object[] {id});
    }
    @Override
    public void updateTable(String name,int id) {
        String sql = "update client set surname =? where id =?;";
        jdbcTemplate.update(sql,new Object[] {name, id} );
    }

    public void addLine(int id, String surname,String region, double discount)
    {
        String sql = "insert into client values(?, ?, ?, ?);";
        jdbcTemplate.update(sql,new Object[] {id, surname, region, discount} );
    }
    public List findUniqueRegion()
    {
        String sql = "select DISTINCT region from client;";
        return jdbcTemplate.queryForList(sql);
    }
    public List findNizhegorodskyClient()
    {
        String sql = "select surname, discount from client where region='Nizhegorodsky';";
        return jdbcTemplate.queryForList(sql);
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setDataSource(javax.sql.DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
