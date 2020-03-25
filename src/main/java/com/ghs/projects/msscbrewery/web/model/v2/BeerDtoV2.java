package com.ghs.projects.msscbrewery.web.model.v2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "of")
public class BeerDtoV2 {

    private final UUID id;
    private final String beerName;
    private final BeerStyleEnum beerStyle;
    private final Long upc;

}
