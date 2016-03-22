package mypcg;

import mypcg.DAO.BookDAO;
import mypcg.DAO.BuyDAO;
import mypcg.DAO.ClientDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Ксения on 3/21/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("config.xml");
        //поиск всех различных районов проживания
        ClientDAO clientDAO = (ClientDAO)context.getBean("clientDAO");
        List clientlist = clientDAO.findUniqueRegion();
        System.out.println("Query Result -->" + clientlist);
        //поиск всех различных названий и цен книг
        BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        List booklist = bookDAO.findUniqueTitle();
        System.out.println("Query Result -->" + booklist);
        List booklist2 = bookDAO.findUniqueCost();
        System.out.println("Query Result -->" + booklist2);
        //поиск всех различных месяцев покупок
        BuyDAO buyDAO = (BuyDAO)context.getBean("buyDAO");
        List buylist = buyDAO.findUniqueBuyMonth();
        System.out.println("Query Result -->" + buylist);
    }
}
