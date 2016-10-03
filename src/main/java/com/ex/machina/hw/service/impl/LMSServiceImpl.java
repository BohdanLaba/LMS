package com.ex.machina.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ex.machina.hw.dao.PersonDaoService;
import com.ex.machina.hw.entity.Person;
import com.ex.machina.hw.service.LMSService;

@Component
public class LMSServiceImpl implements LMSService {

	@Autowired
	PersonDaoService personDao;
	
	
	//TODO add Aspect logging & validation
	
	public Person createPerson(Person person) {
		return personDao.create(person);
	}

	public Person findById(Long id) {
		return personDao.read(id);
	}

	public List<Person> getSubordinates(Long mangerId) {
		return personDao.getSubordinates(mangerId);
	}

}
