package com.mibar.spring.spring6rest.services;

import com.mibar.spring.spring6rest.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}
