package com.nttdata.crfactory.service.mapper;


import com.nttdata.crfactory.domain.*;
import com.nttdata.crfactory.service.dto.FieldMasterDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link FieldMaster} and its DTO {@link FieldMasterDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FieldMasterMapper extends EntityMapper<FieldMasterDTO, FieldMaster> {



    default FieldMaster fromId(String id) {
        if (id == null) {
            return null;
        }
        FieldMaster fieldMaster = new FieldMaster();
        fieldMaster.setId(id);
        return fieldMaster;
    }
}