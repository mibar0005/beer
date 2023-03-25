package com.mibar.spring.spring6rest.services;

import com.mibar.spring.spring6rest.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
