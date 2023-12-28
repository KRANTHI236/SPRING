package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import Dto.Food;
@Component
public class Fooddao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kranthi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(Food food) {
		entityTransaction.begin();
		entityManager.persist(food);
		entityTransaction.commit();
	}
}
