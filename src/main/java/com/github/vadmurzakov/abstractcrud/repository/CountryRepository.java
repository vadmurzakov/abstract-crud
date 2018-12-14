package com.github.vadmurzakov.abstractcrud.repository;

import com.github.vadmurzakov.abstractcrud.model.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends EntityRepository<Country> {
}
