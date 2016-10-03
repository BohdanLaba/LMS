package com.ex.machina.hw.dao;

public interface GenericDaoService<T> {

	T create(T object);

	T read(Long id);

	T update(T object);

	Boolean delete(T object);
}
