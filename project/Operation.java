package bancking.project;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Operation {
	
SessionFactory sf=Hibernate_Util.getSessionFactory();
Session session=sf.openSession();
Account ac=new Account();

public void CreateAccount() {
	Scanner sc=new Scanner(System.in);
	while(true) {
		
		System.out.println("Enter Account Holder Name");
		ac.setAccount_Holder_name(sc.next());
		
		System.out.println("Enter Permanant Address");
		ac.setAccount_Holder_Address(sc.next());
		
		System.out.println("Enter Mobile Number");
		ac.setMobile_Number(sc.next());
		try {
		System.out.println("Enter Password");
		ac.setPassword(sc.next());
		}catch(NumberFormatException e) {
			System.out.println("Enter only Digits");
			
		}
		System.out.println("Enter the Amount");
		double d=sc.nextDouble();
		if(d>=500) {
			ac.setAmount(d);
			
		}else {
			System.out.println("Amount must be greater than 500");
			break;
		}
		
		System.out.println("Account created successfully");
		
		session.save(ac);
		session.beginTransaction().commit();
		session.close();
		sf.close();
break;
	}
   }
    public void ShowAccountDetails() 
    {
    	while(true) {
    	Scanner sc2=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int x=sc2.nextInt();
    	
    	Account ab=session.get(Account.class, x);
    	if(ab.getAccount_Number()==x)
    	{
	System.out.println(ab);
    	
    	}
    	else {
    		System.out.println("Enter correct Account number");
    		
    	}
	session.close();
	sf.close();
	break;
    }
    }
    public void BalanceCheck() 
    {
    	while(true) {
    	Scanner sc3=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int y=sc3.nextInt();
    	
    	Account a=session.get(Account.class, y);
    	if(a.getAccount_Number()==y) {
 
           System.out.println(a.getAmount());
    	}
    	else {
    		System.out.println("Enter correct Account number");
    		break;
    	}
    	session.close();
    	sf.close();
    }
    }
    public void Deposite()
    {
    	while(true) {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int z=sc1.nextInt();
    	
    	Account ab=session.get(Account.class,z);
    	if(ab.getAccount_Number()==z)
    	{
    	System.out.println("Enter the amount to add");
    	double a=sc1.nextDouble();
    	double total=a+ab.getAmount();
    	ab.setAmount(total);
    	
    	}
    	else {
    		System.out.println("Enter correct Account number");	
    	}
    	
    	System.out.println("Deposited successfully");
    	
    	session.save(ab);
    	session.beginTransaction().commit();
    	session.close();
    	sf.close();
    	break;
    	}
    }
    public void Withdraw()
    {
    	while(true) {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int w=sc1.nextInt();
    	
    	Account ab=session.get(Account.class,w);
    	if(ab.getAccount_Number()==w)
    	{
    	System.out.println("Enter the amount to Withdraw");
    	double a=sc1.nextDouble();
    	double total=ab.getAmount()-a;
    	ab.setAmount(total);
    	}
    	else {
    		System.out.println("Enter correct Account number");
    		
    	}
    	System.out.println("Withdraw successfully");
    	session.save(ab);
    	session.beginTransaction().commit();
    	session.close();
    	sf.close();
    	break;
    }
    }

}
