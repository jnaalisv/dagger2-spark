package org.example.persistence.inmemory;

import org.example.persistence.AircraftRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class InMemoryAircraftRepository implements AircraftRepository {

    private final List<String> aircrafts;

    public InMemoryAircraftRepository() {
        this(
                Arrays.asList(
                        "Airbus A350",
                        "Airbus A330",
                        "Boeing 747",
                        "Boeing Dreamliner",
                        "Fokker"
                )
        );
    }

    public InMemoryAircraftRepository(List<String> aircrafts) {
        this.aircrafts = aircrafts;
    }


    @Override
    public Collection<String> getAll() {
        return aircrafts;
    }
}
