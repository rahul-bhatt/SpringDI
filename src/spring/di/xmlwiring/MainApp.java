package spring.di.xmlwiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//DI using constructor (See: spring.xml)
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();
		
		//DI using constructor, using another bean as reference (See: spring.xml)
		Performer poeticDuke = (Performer) context.getBean("poeticDuke");
		poeticDuke.perform();
		
		//DI using properties (See: spring.xml)
		Performer kenny = (Performer) context.getBean("kenny");
		kenny.perform();
		
		//DI using properties list (See: spring.xml)
		Performer hank = (Performer) context.getBean("hank");
		hank.perform();
		
	}
}
