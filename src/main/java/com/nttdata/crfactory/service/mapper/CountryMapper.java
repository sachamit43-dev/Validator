package com.nttdata.crfactory.service.mapper;


import com.nttdata.crfactory.domain.*;
import com.nttdata.crfactory.service.dto.CountryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Country} and its DTO {@link CountryDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CountryMapper extends EntityMapper<CountryDTO, Country> {


    @Mapping(target = "locations", ignore = true)
    @Mapping(target = "removeLocation", ignore = true)
    Country toEntity(CountryDTO countryDTO);

    default Country fromId(String id) {
        if (id == null) {
            return null;
        }
        Country country = new Country();
        country.setId(id);
        return country;
    }
}
