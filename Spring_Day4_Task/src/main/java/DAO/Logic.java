package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.Car;

public class Logic {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Car insertBoth(Car car) {

		et.begin();
		em.persist(car);
		et.commit();
		return car;
	}
}
