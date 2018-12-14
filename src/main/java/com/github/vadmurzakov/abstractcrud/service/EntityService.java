package com.github.vadmurzakov.abstractcrud.service;

import com.github.vadmurzakov.abstractcrud.model.Model;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface EntityService<E extends Model> {
	Optional<E> save(E entity);

	List<E> saveAll(List<E> entities);

	Optional<E> update(E entity);

	Optional<E> get(Serializable id);

	List<E> getAll();

	Boolean delete(Serializable id);
}
