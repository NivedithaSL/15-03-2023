package DI_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoblieApplication {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("direference.xml");
	Mobile mobile=(Mobile)applicationContext.getBean("mymobile");//to get the mobile object
	System.out.println(mobile);
//	Sim sim=(Sim)applicationContext.getBean("mysim");//to get the sim object
//	System.out.println(sim);
}
}
