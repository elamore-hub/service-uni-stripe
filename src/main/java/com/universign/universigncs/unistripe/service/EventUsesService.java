package com.universign.universigncs.unistripe.service;

import com.universign.universigncs.unistripe.domain.EventUses;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link EventUses}.
 */
public interface EventUsesService {

    /**
     * Save a eventUses.
     *
     * @param eventUses the entity to save.
     * @return the persisted entity.
     */
    EventUses save(EventUses eventUses);

    /**
     * Get all the eventUses.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<EventUses> findAll(Pageable pageable);


    /**
     * Get the "id" eventUses.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EventUses> findOne(Long id);

    /**
     * Delete the "id" eventUses.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
