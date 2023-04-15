package com.zara.demo.config;

/**
 * Application constants.
 */
public class Constants {

    public static final String SPRING_INFO = "\n---------------------------------------------------------------------------\n\t"
            + "CodTrackerApplication '{}' is running! Access URLs:\n\t"
            + "Local Https: \t\t{}://localhost:{}\n\t"
            + "External Https: \t{}://{}:{}\n\t"
            + "H2 Console: \t\thttp://localhost:{}/h2-console/\n\t"
            + "\t\n---------------------------------------------------------------------------";
    public static final String SPRING_PROPERTY_ENV = "spring.application.name";
    public static final String SPRING_PROPERTY_PORT = "server.port";
    public static final String SPRING_HTTP_PROTOCOL = "http";
    public static final String NOT_FOUND = " product is not found";
    public static final String JUMP_LINE_TEST = "\n------------------------------------------------------------------\n";
    public static final String URL_API_PRICES = "/api/prices/";
    public static final String URL_SEPARATOR = "/";

    public static final String URL_LOCALHOST ="http://localhost:";
}
