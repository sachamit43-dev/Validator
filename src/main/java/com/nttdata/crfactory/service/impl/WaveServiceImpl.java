package com.nttdata.crfactory.service.impl;

import com.nttdata.crfactory.service.WaveService;
import com.nttdata.crfactory.domain.Wave;
import com.nttdata.crfactory.repository.WaveRepository;
import com.nttdata.crfactory.service.dto.WaveDTO;
import com.nttdata.crfactory.service.mapper.WaveMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Wave}.
 */
@Service
public class WaveServiceImpl implements WaveService {

    private final Logger log = LoggerFactory.getLogger(WaveServiceImpl.class);

    private final WaveRepository waveRepository;

    private final WaveMapper waveMapper;

    public WaveServiceImpl(WaveRepository waveRepository, WaveMapper waveMapper) {
        this.waveRepository = waveRepository;
        this.waveMapper = waveMapper;
    }

    @Override
    public WaveDTO save(WaveDTO waveDTO) {
        log.debug("Request to save Wave : {}", waveDTO);
        Wave wave = waveMapper.toEntity(waveDTO);
        wave = waveRepository.save(wave);
        return waveMapper.toDto(wave);
    }

    @Override
    public Page<WaveDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Waves");
        return waveRepository.findAll(pageable)
            .map(waveMapper::toDto);
    }


    public Page<WaveDTO> findAllWithEagerRelationships(Pageable pageable) {
        return waveRepository.findAllWithEagerRelationships(pageable).map(waveMapper::toDto);
    }

    @Override
    public Optional<WaveDTO> findOne(String id) {
        log.debug("Request to get Wave : {}", id);
        return waveRepository.findOneWithEagerRelationships(id)
            .map(waveMapper::toDto);
    }

    @Override
    public void delete(String id) {
        log.debug("Request to delete Wave : {}", id);
        waveRepository.deleteById(id);
    }
}
