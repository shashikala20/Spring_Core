package classFiles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 
	public static void main(String[] args) { 		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		BankAccount bankAccount = (BankAccount) applicationContext.getBean("bankAccount");	
//		System.out.println(bankAccount);		
//		System.out.println(bankAccount.getAccountBalance());
		
		BankAccountController bankAccountController = applicationContext.getBean("bankAccountController", BankAccountController.class);
//		BankAccount bankAccount1 = applicationContext.getBean("bankAccountController", BankAccountController.class);
		System.out.println(bankAccountController.getBalance(1000)); 
		System.out.println(bankAccountController.deposit(1000, 3000));
		System.out.println(bankAccountController.withdraw(2001, 5000));
		System.out.println(bankAccountController.getBalance(4001));


	}
}
