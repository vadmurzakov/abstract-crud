package com.github.vadmurzakov.abstractcrud.controller;

import com.github.vadmurzakov.abstractcrud.exception.EntityNotFoundException;
import com.github.vadmurzakov.abstractcrud.model.Model;
import com.github.vadmurzakov.abstractcrud.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public abstract class AbstractController<E extends Model, S extends EntityService<E>> {

	@Autowired
	protected S service;

	@PostMapping
	public E save(@RequestBody E entity) {
		return service.save(entity);
	}

	@PutMapping
	public E update(@RequestBody E entity) {
		return service.update(entity);
	}

	@GetMapping("/{id}")
	public E get(@PathVariable Serializable id) {
		return service.get(id).orElseThrow(
				() -> new EntityNotFoundException(String.valueOf(id))
		);
	}

	@DeleteMapping("/{id}")
	public Boolean delete(@PathVariable Serializable id) {
		return service.delete(id);
	}
}
