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
        //поиск клиентов и названий магазинов для покупок
        BuyDAO buyDAO = (BuyDAO)context.getBean("buyDAO");
        List buylist =  buyDAO.findClientAndStoreName();
        System.out.println("Query result -->" + buylist);
        //поиск деталей заказа(имя клиента, название книги и тд)
        List buylist2 =  buyDAO.findBuySpeciality();
        System.out.println("Query result -->" + buylist2);
    }
}
