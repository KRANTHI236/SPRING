package Spring_Day2_Task;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {

		BeanFactory bf = new ClassPathXmlApplicationContext("car.xml");
		ClassForBmw bmw = (ClassForBmw) bf.getBean("car1");
		System.out.println(bmw.getId());
		System.out.println(bmw.getName());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getModel());

		ClassForAudi audi = (ClassForAudi) bf.getBean("car");
		System.out.println(audi.getId());
		System.out.println(audi.getName());
		System.out.println(audi.getPrice());
		System.out.println(audi.getModel());

	}

}
