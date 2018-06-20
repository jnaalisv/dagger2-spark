package org.example;

import dagger.Component;
import org.example.domain.AircraftService;

import static spark.Spark.get;
import static spark.Spark.port;

public class SparkApplication {

    @Component(modules = DaggerConfig.class)
    interface SparkAppContainer {
        AircraftService aircraftService();
    }

    public static void main(String[] args) {
        final SparkAppContainer sparkAppContainer = DaggerSparkApplication_SparkAppContainer
                .builder()
                .build();

        final AircraftService aircraftService = sparkAppContainer
                .aircraftService();

        port(4567);
        get("/aircrafts", (request, response) -> aircraftService.getAll());
    }
}
