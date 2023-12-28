package CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Logic;
import DTO.Company;
import DTO.Manager;

public class MainClass {
	@Autowired
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("company.xml");

		Company company = (Company) applicationContext.getBean("company");
		Manager manager = (Manager) applicationContext.getBean("manager");

		Logic logic = (Logic) applicationContext.getBean("logic");

		logic.saveBoth(company);

	}
}
