package mypcg.DAO;

import java.util.List;
import java.util.Map;

/**
 * Created by Ксения on 3/20/2016.
 */
public interface DAO {
    public List<Map<String,Object>> findAll();
    public int lineCount();
    public void deleteLine(int id);
    public void updateTable(String name, int id);
}
