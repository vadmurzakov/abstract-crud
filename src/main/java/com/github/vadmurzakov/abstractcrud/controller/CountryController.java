package com.github.vadmurzakov.abstractcrud.controller;

import com.github.vadmurzakov.abstractcrud.model.Country;
import com.github.vadmurzakov.abstractcrud.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController extends AbstractController<Country, CountryService> {
}