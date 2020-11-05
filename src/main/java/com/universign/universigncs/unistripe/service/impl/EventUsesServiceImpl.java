package com.universign.universigncs.unistripe.service.impl;

import com.universign.universigncs.unistripe.service.EventUsesService;
import com.universign.universigncs.unistripe.domain.EventUses;
import com.universign.universigncs.unistripe.repository.EventUsesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link EventUses}.
 */
@Service
@Transactional
public class EventUsesServiceImpl implements EventUsesService {

    private final Logger log = LoggerFactory.getLogger(EventUsesServiceImpl.class);

    private final EventUsesRepository eventUsesRepository;

    public EventUsesServiceImpl(EventUsesRepository eventUsesRepository) {
        this.eventUsesRepository = eventUsesRepository;
    }

    @Override
    public EventUses save(EventUses eventUses) {
        log.debug("Request to save EventUses : {}", eventUses);
        return eventUsesRepository.save(eventUses);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<EventUses> findAll(Pageable pageable) {
        log.debug("Request to get all EventUses");
        return eventUsesRepository.findAll(pageable);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<EventUses> findOne(Long id) {
        log.debug("Request to get EventUses : {}", id);
        return eventUsesRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete EventUses : {}", id);
        eventUsesRepository.deleteById(id);
    }
}
