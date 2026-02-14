# hello-world

A simple Spring Boot REST API application for greeting.

## Project Structure

- **controller**: REST API endpoints
- **service**: Business logic
- **model**: Domain objects
- **resources**: Configuration and static files

## Prerequisites

- Java 17+
- Maven 3.6+

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Documentation

See [docs/API.md](docs/API.md) for endpoint documentation.

### Swagger UI

After starting the app, open:

- http://localhost:8080/swagger-ui/index.html

### OpenAPI Spec

- http://localhost:8080/v3/api-docs

## Testing

```bash
mvn test
```

## Building

```bash
mvn clean install
```