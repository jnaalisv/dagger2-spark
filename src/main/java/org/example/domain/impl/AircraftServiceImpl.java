package org.example.domain.impl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.example.domain.AircraftService;
import org.example.persistence.AircraftRepository;

import javax.inject.Inject;
import java.util.Collection;

public class AircraftServiceImpl implements AircraftService {

    private final AircraftRepository aircraftRepository;

    @Inject
    public AircraftServiceImpl(final AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    @Override
    public Collection<String> getAll() {
        return aircraftRepository.getAll();
    }
}
