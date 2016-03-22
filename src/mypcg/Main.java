package mypcg;

import mypcg.DAO.BookDAO;
import mypcg.DAO.BuyDAO;
import mypcg.DAO.ClientDAO;
import mypcg.DAO.StoreDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Ксения on 3/21/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("config.xml");
        //поиск клиентов из Нижегородского района
        ClientDAO clientDAO = (ClientDAO)context.getBean("clientDAO");
        List clientlist = clientDAO.findNizhegorodskyClient();
        System.out.println("Query Result -->" + clientlist);
        //поиск магазинов в Сормовском и Советском районах
        StoreDAO storeDAO = (StoreDAO)context.getBean("storeDAO");
        List storelist = storeDAO.findSormovskyAndSovetskyStore();
        System.out.println("Query Result -->" + storelist);
        //поиск книг с Windows или стоящих > 20000
        BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        List booklist = bookDAO.findWindowsOrMore20000();
        System.out.println("Query Result -->" + booklist);
    }
}
