package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.PersonDto;

public class Logic {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insertBoth(PersonDto personDto) {

		et.begin();
		em.persist(personDto);
		et.commit();
	}

}
