package com.github.vadmurzakov.abstractcrud.controller;

import com.github.vadmurzakov.abstractcrud.model.City;
import com.github.vadmurzakov.abstractcrud.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cities")
public class CityController extends AbstractController<City, CityService> {
}
