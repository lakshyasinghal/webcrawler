package com.lakshya.webcrawler.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

	public Optional<T> get(int id);

	public List<T> getAll();

	public T save(T t);

	public void update(T t);

	public void delete(T t);
}
