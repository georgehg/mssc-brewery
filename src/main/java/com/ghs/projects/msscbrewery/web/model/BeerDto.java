package com.ghs.projects.msscbrewery.web.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "of")
public class BeerDto {

    private final UUID id;
    private final String beerName;
    private final String beerStyle;
    private final Long upc;

}
