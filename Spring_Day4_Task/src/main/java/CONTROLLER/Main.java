package CONTROLLER;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Logic;
import DTO.Car;
import DTO.Engine;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("car.xml");

		Car car1 = ac.getBean("car", Car.class);
		Engine engine = ac.getBean("eng", Engine.class);
		Logic logic = ac.getBean("log", Logic.class);
		logic.insertBoth(car1);

	}
}
