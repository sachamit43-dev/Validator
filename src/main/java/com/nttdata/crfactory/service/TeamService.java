package com.nttdata.crfactory.service;

import com.nttdata.crfactory.service.dto.TeamDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.nttdata.crfactory.domain.Team}.
 */
public interface TeamService {

    /**
     * Save a team.
     *
     * @param teamDTO the entity to save.
     * @return the persisted entity.
     */
    TeamDTO save(TeamDTO teamDTO);

    /**
     * Get all the teams.
     *
     * @return the list of entities.
     */
    List<TeamDTO> findAll();


    /**
     * Get the "id" team.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TeamDTO> findOne(String id);

    /**
     * Delete the "id" team.
     *
     * @param id the id of the entity.
     */
    void delete(String id);
}
