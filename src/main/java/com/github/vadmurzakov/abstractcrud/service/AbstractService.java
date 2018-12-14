package com.github.vadmurzakov.abstractcrud.service;

import com.github.vadmurzakov.abstractcrud.exception.EntityNotFoundException;
import com.github.vadmurzakov.abstractcrud.model.Model;
import com.github.vadmurzakov.abstractcrud.repository.EntityRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends Model, R extends EntityRepository<E>> implements EntityService<E> {
	@Autowired
	private R repository;

	@Override
	public Optional<E> save(E entity) {
		return Optional.of(repository.save(entity));
	}

	@Override
	public List<E> saveAll(List<E> entities) {
		return Lists.newArrayList(repository.saveAll(entities));
	}

	@Override
	public Optional<E> update(E entity) {
		return Optional.of(repository.save(entity));
	}

	@Override
	public Optional<E> get(Serializable id) {
		return repository.findById(id);
	}

	@Override
	public List<E> getAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Boolean delete(Serializable id) {
		E entity = get(id).orElseThrow(
				() -> new EntityNotFoundException(String.valueOf(id))
		);
		repository.delete(entity);
		return !repository.findById(id).isPresent();
	}
}
