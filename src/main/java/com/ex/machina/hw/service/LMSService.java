package com.ex.machina.hw.service;

import java.util.List;

import com.ex.machina.hw.dao.entity.Person;

public interface LMSService {
	Person createPerson(Person person);

	Person updatePerson(Person person);

	Person findById(Long id);

	List<Person> getSubordinates(Long mangerId);
}
