# pocket-pharmacy-api

Domestic medicine administration application's api.

[![Build](https://github.com/jbence1994/pocket-pharmacy-api/actions/workflows/build.yml/badge.svg)](https://github.com/jbence1994/pocket-pharmacy-api/actions/workflows/build.yml)

## Prerequisites

To avoid any unexpected behaviour, make sure you have installed the following tools:

- [OpenJDK 11](https://adoptium.net/temurin/releases)
- [Maven 3.8.5](https://maven.apache.org/download.cgi)

## Running project locally

1. To install third-party dependencies, make sure you run:

```bash
mvn clean install
```

2. Run with Spring Boot Maven plugin:

```bash
mvn spring-boot:run
```

OR

3. Run with packaging:

```bash
mvn clean package

java -jar target/pocket-pharmacy-api-0.0.1-SNAPSHOT.jar
```

4. To view endpoints, open [SwaggerUI](http://localhost:8080/swagger-ui.html) in your browser.
