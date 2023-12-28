package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import Dto.Bus;
@Component
public class Busdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kranthi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Bus bus) {
		entityTransaction.begin();
		entityManager.persist(bus);
		entityTransaction.commit();
	}

}
