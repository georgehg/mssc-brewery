package com.ghs.projects.msscbrewery.services.v2;

import com.ghs.projects.msscbrewery.web.model.v2.BeerDtoV2;
import com.ghs.projects.msscbrewery.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
    return BeerDtoV2.of(beerId, "Stela Artoir", BeerStyleEnum.PISLSNER, null);
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.of(UUID.randomUUID(), beerDto.getBeerName(), beerDto.getBeerStyle(), beerDto.getUpc());
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        BeerDtoV2.of(beerId, beerDto.getBeerName(), beerDto.getBeerStyle(), beerDto.getUpc());
    }

    @Override
    public void deleteBeer(UUID beerId) {

    }

}
