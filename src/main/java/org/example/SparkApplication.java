package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.get;
import static spark.Spark.port;

public class SparkApplication {
    private static final Logger logger = LoggerFactory.getLogger(SparkApplication.class);

    public static void main(String[] args) {
        port(4567);
        get("/hello", (request, response) -> {
            logger.info("hello");
            return "Hello, World";
        });
    }
}
