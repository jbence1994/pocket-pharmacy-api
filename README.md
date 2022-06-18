# pocket-pharmacy-api

Domestic medicine administration application's api.

[![Build](https://github.com/jbence1994/pocket-pharmacy-api/actions/workflows/build.yml/badge.svg)](https://github.com/jbence1994/pocket-pharmacy-api/actions/workflows/build.yml)

[Contribution](CONTRIBUTING.md)

## Prerequisites

A) To avoid any unexpected behaviour, make sure you have installed the following tools:

- [OpenJDK 11](https://adoptium.net/temurin/releases)
- [Maven 3.8.5](https://maven.apache.org/download.cgi)

B) If you are using IntelliJ IDEA, make sure you enable detekt plugin to see format style violations at compile time:

1. Open File -> Settings -> Tools -> Detekt
2. Select `Enable Detekt`, `Enable rules upon the default configuration` and `Enable formatting (ktlint) rules` options
3. At `Configuration files` section, browse `detekt.yml` from the project's files

If you are working in a different IDE or text editor, don't worry: ktlint Maven plugin will automatically format the code for you!

## Running project locally

### Creating database secrets configuration file:

Before start, make sure to provide your local database's credentials. Create a file called `database-secrets.yml` in `src/main/resouces`, then put these configuration keys into that:

```yaml
jpa-connection:
  host: 
  port: 
  database: 
  username: 
  password: 
```

Finally, provide your local database's credential property values next to the keys.\
#### Note that: this configuration file is excluded from git tracking, so don't worry about to commit your database credentials :slightly_smiling_face:

### Start application

1. To install third-party dependencies, to create database schema and populate it with test data locally, make sure you run:

```bash
mvn clean install -Dspring.profiles.active=dev
```

2. Run with Spring Boot Maven plugin:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

OR

3. Run with packaging:

```bash
mvn clean package

java -jar -Dspring.profiles.active=dev target/<jar-name>.jar
```

4. To view endpoints, open [SwaggerUI](http://localhost:8080/swagger-ui.html) in your browser.
