package com.ex.machina.hw.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ex.machina.hw.dao.PersonDaoService;
import com.ex.machina.hw.dao.entity.Person;

@Repository
public class PersonDaoServiceImpl implements PersonDaoService {

	private static String FIND_BY_ID = "SELECT p From Person p WHERE p.id = :personId";
	private static String FIND_SUBORDINNATES = "SELECT p From Person p WHERE p.managerId = :managerId";

	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Person create(Person object) {
		entityManager.persist(object);
		return object;
	}

	public Person read(Long id) {
		// CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		Query query = entityManager.createQuery(FIND_BY_ID);
		query.setParameter("personId", id);
		return (Person) query.getSingleResult();
	}

	public Person update(Person object) {
		return entityManager.merge(object);
	}

	public Boolean delete(Person object) {
		entityManager.remove(object);
		return Boolean.TRUE;
	}

	public List<Person> getSubordinates(Long managerId) {
		Query query = entityManager.createQuery(FIND_SUBORDINNATES);
		query.setParameter("managerId", managerId);
		return query.getResultList();
	}
}
