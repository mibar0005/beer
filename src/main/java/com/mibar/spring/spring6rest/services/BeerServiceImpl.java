package com.mibar.spring.spring6rest.services;

import com.mibar.spring.spring6rest.model.Beer;
import com.mibar.spring.spring6rest.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    //Use the Builder that implemented at the Beer POJO to  build a new beer
    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get Beer Id - in service. Id: " + id.toString());

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal(12.49))
                .quantityOnHand(122)
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
