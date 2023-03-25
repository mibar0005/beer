package com.mibar.spring.spring6rest.controller;

import com.mibar.spring.spring6rest.model.Beer;
import com.mibar.spring.spring6rest.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {

        log.debug("Get beer by Id - in controller");

        return beerService.getBeerById(id);
    }
}
