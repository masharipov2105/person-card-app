```
# Personal Card App

A simple console-based application built with Java Core. Users can create, view, update, and delete their personal card (name, age, city).

## Application Preview

```
WELCOME TO PERSONAL CARD APP!

============ MENU ============
1. Create Card
2. View Card
3. Edit Name
4. Edit Age
5. Edit City
6. Delete Card
0. Exit
==============================
Choice: 
```

## Getting Started

### Download JAR
https://github.com/masharipov2105/personal-card/releases/tag/v1.0.0

### Run the Application
```
java -jar personal-card-1.0.0.jar
```

### Or using Maven
```
mvn clean compile
mvn exec:java -Dexec.mainClass="com.masharipov2105.systems.Main"
```

## Technologies

- Java 17
- Maven
- JUnit 5
- Gson

## Architecture

Layered Architecture: UI -> Service (Interface + Implementation) -> Storage -> Model

## Features

- Create card (name, age, city)
- View card
- Edit name
- Edit age
- Edit city
- Delete card
- Check if card exists

## Tests

Run tests:
```
mvn test
```

Results: 28 tests, all passed.

## Releases

| Version | Date | Changes |
|---------|------|---------|
| v1.0.0 | 2026-09-01 | Initial release |

## Author

Masharipov
GitHub: https://github.com/masharipov2105

## License

MIT License
```
