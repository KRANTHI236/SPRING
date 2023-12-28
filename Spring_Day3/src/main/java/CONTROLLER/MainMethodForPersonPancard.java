package CONTROLLER;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.Logic;
import DTO.PancardDto;
import DTO.PersonDto;

public class MainMethodForPersonPancard {

	public static void main(String[] args) {

		BeanFactory bf = new ClassPathXmlApplicationContext("person.xml");
		PersonDto personDto = (PersonDto) bf.getBean("person");

		PancardDto pancardDto = (PancardDto) bf.getBean("pancard1");

		Logic logic = (Logic) bf.getBean("logic");
		logic.insertBoth(personDto);

	}

}
