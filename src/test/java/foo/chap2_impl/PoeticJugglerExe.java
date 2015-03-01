package foo.chap2_impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import foo.chap2.PerformanceException;
import foo.chap2.Performer;

public class PoeticJugglerExe {
	public static void main(String args[]){
	//ApplicationContext ctx = new ClassPathXmlApplicationContext ("F:/programing/java/Spring/JavaSpring_inaction/conf/beanConf.xml");
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext ("classpath:beanConf.xml");
		
	Performer performer = (Performer) ctx.getBean("poeticDuke");
	try{
	performer.perform();
	}
	catch (PerformanceException e){
		System.out.printf("exception occured");
	}	

	}//end main()

}//end PoeticJugglerExe
