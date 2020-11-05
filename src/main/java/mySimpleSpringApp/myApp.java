package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {

		
		//Fruit f = new Fruit();
		//Vegetable v =new Vegetable();
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Fruit myfruit = appContext.getBean("fruit",Fruit.class);
		Vegetable myvegetable =(Vegetable)appContext.getBean("vegetable");	
		Fruit fruitt=(Fruit)appContext.getBean("fruitwithlistandmap");
		
		System.out.println(myfruit.talkaboutyourself());
		System.out.println(myvegetable.talkaboutyourself());
		System.out.println(fruitt.talkaboutyourself());
		
		
		

	}

}
