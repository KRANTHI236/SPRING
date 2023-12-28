package School;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {

	public static void main(String[] args) {

//		Chaitanya chaitanya = new Chaitanya();
//		chaitanya.name();
//
//		tsschool tsschool = new Chaitanya();
//		tsschool.name();

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("school.xml");
		Chaitanya chaitanya2 = (Chaitanya) beanFactory.getBean("sch");
		chaitanya2.name();
		System.out.println(chaitanya2.getFee());
		System.out.println(chaitanya2.getAdd());

		Parayana parayana = (Parayana) beanFactory.getBean("sch1");
		parayana.name();
		System.out.println(parayana.getFee());
		System.out.println(parayana.getAdd());

//		tsschool tsschool2 = (School.tsschool) beanFactory.getBean("sch");
//		tsschool2.name();
//
//		tsschool tsschool3 = (School.tsschool) beanFactory.getBean("sch1");
//		tsschool3.name();

	}

}
