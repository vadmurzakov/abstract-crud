package com.github.vadmurzakov.abstractcrud.repository;

import com.github.vadmurzakov.abstractcrud.model.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends EntityRepository<City> {
}
