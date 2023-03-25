package com.mibar.spring.spring6rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerControllerTest {

    //Bring in the BeerController and autowire it.
    @Autowired
    BeerController beerController;

    @Test
    void getBeerById() {

        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }
}