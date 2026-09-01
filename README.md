```
# Personal Card App

A simple console-based application built with Java Core. Users can create, view, update, and delete their personal card (name, age, city).

---

## Application Preview

```
========================================
        WELCOME TO PERSONAL CARD APP!
========================================

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

---

## Getting Started

### 1. Download JAR
https://github.com/masharipov2105/personal-card/releases/tag/v1.0.0

### 2. Run the Application
```
java -jar personal-card-1.0.0.jar
```

### 3. Or using Maven
```
mvn clean compile
mvn exec:java -Dexec.mainClass="com.masharipov2105.systems.Main"
```

---

## Technologies

| Technology | Description |
|------------|-------------|
| Java 17 | Core programming language |
| Maven | Build and dependency management |
| JUnit 5 | Unit testing framework |
| Gson | JSON serialization/deserialization |

---

## Architecture

The project follows Layered Architecture:

```
+---------------------------------------------------+
|                   UI LAYER                         |
|                  ConsoleUI.java                    |
+---------------------------------------------------+
|                  SERVICE LAYER                     |
|            CardService (Interface)                 |
|            CardServiceImpl (Implementation)        |
+---------------------------------------------------+
|                  STORAGE LAYER                     |
|                 CardStorage.java                   |
+---------------------------------------------------+
|                  MODEL LAYER                       |
|                   Person.java                      |
+---------------------------------------------------+
```

---

## Features

| # | Feature | Description |
|---|---------|-------------|
| 1 | Create | Create a new card with name, age, and city |
| 2 | View | Display the card in the console |
| 3 | Edit Name | Update the name |
| 4 | Edit Age | Update the age |
| 5 | Edit City | Update the city |
| 6 | Delete | Delete the card |
| 7 | Check | Check if a card exists |

---

## Tests

Run tests with:
```
mvn test
```

Results:
```
[INFO] Tests run: 28, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

Test Coverage:

| Test Class | Tests | Status |
|------------|-------|--------|
| PersonTest | 7 | PASSED |
| CardStorageTest | 4 | PASSED |
| CardServiceImplTest | 16 | PASSED |
| MainTest | 1 | PASSED |
| Total | 28 | ALL PASSED |

---

## Project Structure

```
personal-card/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/masharipov2105/systems/
│   │           ├── models/
│   │           │   └── Person.java
│   │           ├── storage/
│   │           │   └── CardStorage.java
│   │           ├── service/
│   │           │   ├── CardService.java
│   │           │   └── CardServiceImpl.java
│   │           ├── ui/
│   │           │   └── ConsoleUI.java
│   │           └── Main.java
│   └── test/
│       └── java/
│           └── com/masharipov2105/systems/
│               ├── models/
│               │   └── PersonTest.java
│               ├── storage/
│               │   └── CardStorageTest.java
│               └── service/
│                   └── CardServiceImplTest.java
├── pom.xml
├── README.md
└── run.sh
```

---

## Releases

| Version | Date | Changes |
|---------|------|---------|
| v1.0.0 | 2026-09-01 | Initial release |

---

## Author

- Name: Masharipov
- GitHub: https://github.com/masharipov2105

---

## License

This project is open-source and available under the MIT License.
```
