package org.example.domain.impl;

import org.example.domain.AircraftService;
import org.example.persistence.AircraftRepository;

import java.util.Collection;

public class AircraftServiceImpl implements AircraftService {

    private final AircraftRepository aircraftRepository;

    public AircraftServiceImpl(final AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    @Override
    public Collection<String> getAll() {
        return aircraftRepository.getAll();
    }
}
