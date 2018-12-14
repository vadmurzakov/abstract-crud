package com.github.vadmurzakov.abstractcrud.service;

import com.github.vadmurzakov.abstractcrud.model.Country;
import com.github.vadmurzakov.abstractcrud.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService extends AbstractService<Country, CountryRepository> {
}
