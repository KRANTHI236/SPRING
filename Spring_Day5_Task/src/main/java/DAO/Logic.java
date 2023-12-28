package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import DTO.Company;

@Component
public class Logic {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kranthi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(Company company) {

		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
		
	}

}
