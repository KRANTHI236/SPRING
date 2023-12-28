package com.springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		Movie movie = new Movie("baby", 1000000, 2.30, "viraj", "vaishu");
		System.out.println(movie);

		BeanFactory bf = new ClassPathXmlApplicationContext("movie.xml");
		Movie movie2 = (Movie) bf.getBean("movie");
		System.out.println(movie2);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("movie.xml");
		Movie movie3 = applicationContext.getBean("movie", Movie.class);
		System.out.println(movie3);

	}
}
