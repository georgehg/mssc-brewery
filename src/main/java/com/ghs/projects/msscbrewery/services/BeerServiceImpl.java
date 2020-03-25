package com.ghs.projects.msscbrewery.services;

import com.ghs.projects.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
    return BeerDto.of(beerId, "Stela Artoir", "Pilsen", null);
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.of(UUID.randomUUID(), beerDto.getBeerName(), beerDto.getBeerStyle(), beerDto.getUpc());
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        BeerDto.of(beerId, beerDto.getBeerName(), beerDto.getBeerStyle(), beerDto.getUpc());
    }

    @Override
    public void deleteBeer(UUID beerId) {

    }

}
