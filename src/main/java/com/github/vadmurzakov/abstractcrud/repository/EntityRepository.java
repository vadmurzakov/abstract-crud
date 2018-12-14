package com.github.vadmurzakov.abstractcrud.repository;

import com.github.vadmurzakov.abstractcrud.model.Model;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface EntityRepository<E extends Model> extends PagingAndSortingRepository<E, Serializable> {
}
