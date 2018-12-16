package com.github.vadmurzakov.abstractcrud.service;

import com.github.vadmurzakov.abstractcrud.exception.EntityNotFoundException;
import com.github.vadmurzakov.abstractcrud.model.Model;
import com.github.vadmurzakov.abstractcrud.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;

public abstract class AbstractService<E extends Model, R extends EntityRepository<E>> implements EntityService<E> {
	@Autowired
	protected R repository;

	@Override
	public E save(E entity) {
		return repository.save(entity);
	}

	@Override
	public E update(E entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<E> get(Serializable id) {
		return repository.findById(id);
	}

	@Override
	public Boolean delete(Serializable id) {
		E entity = get(id).orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
		repository.delete(entity);
		return !repository.findById(id).isPresent();
	}
}
