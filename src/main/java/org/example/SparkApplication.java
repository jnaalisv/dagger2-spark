package org.example;

import org.example.domain.AircraftService;
import org.example.domain.impl.AircraftServiceImpl;
import org.example.persistence.inmemory.InMemoryAircraftRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static spark.Spark.get;
import static spark.Spark.port;

public class SparkApplication {
    private static final Logger logger = LoggerFactory.getLogger(SparkApplication.class);

    public static void main(String[] args) {

        final AircraftService aircraftService = new AircraftServiceImpl(
          new InMemoryAircraftRepository(
                  Arrays.asList(
                          "Airbus A350",
                          "Airbus A330",
                          "Boeing 747",
                          "Boeing Dreamliner",
                          "Fokker"
                  )
          )
        );

        port(4567);
        get("/hello", (request, response) -> "Hello, World");
        get("/aircrafts", (request, response) -> aircraftService.getAll());
    }
}
