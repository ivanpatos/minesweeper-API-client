# Minesweeper-API Client

API client library, using Spring Cloud


## Requirements

- java 8 (https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- maven (https://maven.apache.org/download.cgi)


## Notes

The project includes an integration test. The test creates a player and a game (3x3 with no mines), flags and then places a question mark on a cell, pauses and unpauses the game, and finally reveals other cell, winning the game. 

The idea is to test the whole api from the client side.

Please make sure the backend is running. The server url can be configured in the application.properties (src/main/resources)

## Build & run

If you want to build everything and run the test:

```
> mvn clean package
```

Build without running the test:

```
> mvn clean package -DskipTests
```
