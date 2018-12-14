package com.github.vadmurzakov.abstractcrud.service;

import com.github.vadmurzakov.abstractcrud.model.Model;

import java.io.Serializable;
import java.util.Optional;

public interface EntityService<E extends Model> {
	E save(E entity);

	E update(E entity);

	Optional<E> get(Serializable id);

	Boolean delete(Serializable id);
}
