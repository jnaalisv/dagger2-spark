package org.example;

import dagger.Provides;
import dagger.Module;
import org.example.domain.AircraftService;
import org.example.domain.impl.AircraftServiceImpl;
import org.example.persistence.AircraftRepository;
import org.example.persistence.inmemory.InMemoryAircraftRepository;

@Module
class DaggerConfig {

    @Provides
    static AircraftRepository provideAircraftRepository() {
        return new InMemoryAircraftRepository();
    }

    @Provides
    static AircraftService provideAircraftService(AircraftServiceImpl aircraftService) {
        return aircraftService;
    }
}
