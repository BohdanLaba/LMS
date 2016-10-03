package com.ex.machina.hw.dao;

import java.util.List;

import com.ex.machina.hw.dao.entity.Person;

public interface PersonDaoService extends GenericDaoService<Person> {

	List<Person> getSubordinates(Long managerId);
}
