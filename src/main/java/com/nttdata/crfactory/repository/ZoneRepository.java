package com.nttdata.crfactory.repository;

import com.nttdata.crfactory.domain.Zone;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Zone entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ZoneRepository extends MongoRepository<Zone, String> {
}
