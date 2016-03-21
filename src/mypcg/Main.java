package mypcg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Ксения on 3/21/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("config.xml");
        ClientDAO clientDAO = (ClientDAO)context.getBean("clientDAO");
        System.out.println("Query Result -->" + clientDAO.findAll());
        clientDAO.addLine(3, "Ivanov", "Avtozavodsky", 3.0);
        System.out.println("Query Result -->" + clientDAO.findAll());
        /*BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        bookDAO.addLine(3, "Fufuka", 15,"thirdStorehouse", 1);
        System.out.println("Query Result -->" + bookDAO.findAll());
        /*StoreDAO storeDAO = (StoreDAO) context.getBean("storeDAO");
        System.out.println("Query Result -->" + storeDAO.lineCount());
        BuyDAO buyDAO = (BuyDAO)context.getBean("buyDAO");
        System.out.println("Query Result -->" + buyDAO.lineCount());*/
    }
}
