# SonarQube Demo - Spring Boot REST API

A simple Spring Boot REST API project for demonstrating SonarQube code analysis.

## Project Structure

```
sonarqube-demo-source/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java
│   │   │   └── controller/
│   │   │       └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/example/demo/
├── pom.xml
└── README.md
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Build and Run

### Build the project
```bash
mvn clean install
```

### Run the application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Hello World
```
GET http://localhost:8080/api/hello
```
Returns: `Hello World!`

### Greeting
```
GET http://localhost:8080/api/greeting
```
Returns JSON:
```json
{
  "message": "Hello",
  "description": "Welcome to SonarQube Demo!"
}
```

## SonarQube Analysis

This project is configured with JaCoCo for code coverage and ready for SonarQube analysis.

### Run SonarQube analysis locally

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=sonarqube-demo \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=your-token
```

### Run tests with coverage
```bash
mvn clean test
```

Coverage reports will be generated in `target/site/jacoco/`

## Features

- ✅ Spring Boot 3.2.1
- ✅ REST API endpoints
- ✅ JaCoCo code coverage
- ✅ SonarQube ready
- ✅ Maven build

## License

MIT
