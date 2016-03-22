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
        //поиск магазина, разположеного не на Автозаводе, где покупали люди со скидкой от 10 до 15 %
        StoreDAO storeDAO = (StoreDAO)context.getBean("storeDAO");
        List storelist =  storeDAO.findStoreNotInAutozavodsky();
        System.out.println("Query result -->" + storelist);
    }
}
