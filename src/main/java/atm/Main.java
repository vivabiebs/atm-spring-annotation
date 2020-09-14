package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Bank bank = context.getBean(Bank.class);
        System.out.println("Welcome to " + bank.getName());
        ATM atm = context.getBean(ATM.class);

        String name = atm.validateCustomer(4, 5678);
        System.out.println(name+" has "+atm.getBalance());
        atm.withdraw(200);
        System.out.println(name+" has "+atm.getBalance());
    }
}
