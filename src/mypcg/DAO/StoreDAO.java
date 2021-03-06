package mypcg.DAO;

import mypcg.DAO.DAO;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ксения on 3/21/2016.
 */
public class StoreDAO implements DAO, Serializable
{
        private javax.sql.DataSource dataSource;
        private JdbcTemplate jdbcTemplate;
        @Override
        public List findAll() {
            String sql = "select * from store;";
            return jdbcTemplate.queryForList(sql);
        }
        @Override
        public int lineCount() {
            String sql = "select count(*) from store;";
            return jdbcTemplate.queryForObject(sql,Integer.TYPE);
        }
        @Override
        public void deleteLine(int id) {
            String sql = "delete from store where id =?;";
            jdbcTemplate.update(sql, new Object[] {id});
        }
        @Override
        public void updateTable(String name,int id) {
            String sql = "update store set name =? where id =?;";
            jdbcTemplate.update(sql,new Object[] {name, id} );
        }
        public void addLine(int id, String name,String region, double commission)
        {
            String sql = "insert into book values(?, ?, ?, ?);";
            jdbcTemplate.update(sql,new Object[] {id, name, region, commission} );
        }
        public List findSormovskyAndSovetskyStore() {
            String sql = "select name from store where region = 'Sormovsky' or region = 'Sovetsky';";
            return jdbcTemplate.queryForList(sql);
        }
        public List findStoreNotInAutozavodsky() {
            String sql = "select * from store where store.region not like 'Autozavodsky' and store.id in (select store_id from buy, client where client_id = client.id and discount between 10 and 15);";
            return jdbcTemplate.queryForList(sql);
        }
        public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public void setDataSource(javax.sql.DataSource dataSource) {
            this.dataSource = dataSource;
        }
}
