package com.github.vadmurzakov.abstractcrud.service;

import com.github.vadmurzakov.abstractcrud.model.City;
import com.github.vadmurzakov.abstractcrud.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityService extends AbstractService<City, CityRepository> {
}
