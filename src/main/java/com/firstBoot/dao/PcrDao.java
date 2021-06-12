package com.firstBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.firstBoot.entity.PcrReturn;

@Repository
public class PcrDao {
	private EntityManager entityManager;
	
	@Autowired
	public PcrDao(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	public List<PcrReturn> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);
		Query<PcrReturn> theQuery = currentSession.createQuery("FROM PcrReturn", PcrReturn.class);
		List<PcrReturn> bookList = theQuery.getResultList();
		return bookList;
	}
	
	public PcrReturn findById(int pcrReturnId) {
		Session currentSession = entityManager.unwrap(Session.class);
		PcrReturn theBook = currentSession.get(PcrReturn.class, pcrReturnId);

		return theBook;
	}
}
