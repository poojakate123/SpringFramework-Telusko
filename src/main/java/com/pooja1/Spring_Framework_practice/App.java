package com.pooja1.Spring_Framework_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pooja1.AppConfig;
import com.pooja1.Car;
import com.pooja1.Samsung;
//import com.pooja1.Tyre;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
       //Car c1 = new Car();
      // c1.drive();
       
      // Bike b1 = new Bike();
       //b1.drive();
    	
    	//To remove dependency between app and car or bike classes we use dependency injection : so created new interface Vehicle
        //getbean : ApplicationContext is interface  : Superset of bean factory  : User for large enterprise application
    	//getbean : BeanFactory package : used for small application ClassPathXmlApplicationContext
    	
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
	//Car c1= (Car)context.getBean("car");
       // c1.drive();
      	

//Tyre t1= (Tyre) context.getBean("tyre");
//System.out.println(t1);

ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);

Samsung s7= factory.getBean(Samsung.class);
s7.config();
    }
}
