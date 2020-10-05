package com.nttdata.crfactory.service.mapper;


import com.nttdata.crfactory.domain.*;
import com.nttdata.crfactory.service.dto.ZoneDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Zone} and its DTO {@link ZoneDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ZoneMapper extends EntityMapper<ZoneDTO, Zone> {



    default Zone fromId(String id) {
        if (id == null) {
            return null;
        }
        Zone zone = new Zone();
        zone.setId(id);
        return zone;
    }
}
