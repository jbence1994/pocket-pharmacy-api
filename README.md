# pocket-pharmacy-api

Domestic medicine administration application's api.

[![Build](https://github.com/jbence1994/pocket-pharmacy-api/actions/workflows/build.yml/badge.svg)](https://github.com/jbence1994/pocket-pharmacy-api/actions/workflows/build.yml)

[Contributing guide](.github/CONTRIBUTING.md)

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

### Creating database secrets configuration file

Before start, make sure you set up a MongoDB database locally on your machine, then perform these steps:

1. Install [v4.25.3](https://github.com/mikefarah/yq/releases/tag/v4.25.3) of [yq](https://github.com/mikefarah/yq) on your machine
2. Generate `database-secrets.yml` configuration file with this [shell script](generate-database-secrets-file.sh)
3. Finally, provide your local database's secrets in place of `null` values

#### Note that: this configuration file is excluded from git tracking, so don't worry about committing your database secrets!

### Compile source code

```bash
mvn clean install
```

### Start application

1. Run with Spring Boot Maven plugin:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

OR

1. Run with packaging:

```bash
mvn clean package

java -jar -Dspring.profiles.active=dev target/<jar-name>.jar
```

2. To view endpoints, open [SwaggerUI](http://localhost:8080/swagger-ui.html) in your browser.
