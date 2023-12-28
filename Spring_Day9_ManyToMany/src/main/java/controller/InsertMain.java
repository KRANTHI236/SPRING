package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.Fooddao;
import Dto.Customer;
import Dto.Food;
import Dto.config;

public class InsertMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(config.class);
		Food food1 = (Food) applicationContext.getBean("food");
		food1.setFoodName("biryani");
		food1.setFoodCost(350);
		food1.setFoodQuantity("full");

		Food food2 = (Food) applicationContext.getBean("food");
		food2.setFoodName("mutton biryani");
		food2.setFoodCost(450);
		food2.setFoodQuantity("full");

		Customer customer1 = (Customer) applicationContext.getBean("customer");
		customer1.setCustomerName("kranthi");
		customer1.setCustomerAddress("hyd");
		customer1.setCustomerOderId(1);

		Customer customer2 = (Customer) applicationContext.getBean("customer");
		customer2.setCustomerName("jai");
		customer2.setCustomerAddress("hyd");
		customer2.setCustomerOderId(2);

		List<Food> list1 = new ArrayList<>();
		list1.add(food1);
		list1.add(food2);

		List<Food> list2 = new ArrayList<>();
		list2.add(food1);

		List<Customer> list11 = new ArrayList<>();
		list11.add(customer1);
		list11.add(customer2);

		List<Customer> list21 = new ArrayList<>();
		list21.add(customer1);

		food1.setCustomer(list11);
		food2.setCustomer(list21);

		Fooddao fooddao = (Fooddao) applicationContext.getBean("fooddao");
		fooddao.saveBoth(food1);
		fooddao.saveBoth(food2);
	}
}
