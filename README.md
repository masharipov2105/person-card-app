# Personal Card App


**Personal Card App** - A small console-based learning project built with Java 17 and Maven that demonstrates the practical use of Layered Architecture and SOLID principles. The application manages a single Person Card and supports full CRUD operations (create, show, update, delete) through an interactive, infinite-loop command prompt. The main goal of this project is educational — to gain hands-on experience in designing a clean, layered, and well-tested codebase rather than solving a real-world business problem.

---


## About the project

A small console-based learning project written in Java 17 and managed with Maven. The main purpose is to practice Layered Architecture and SOLID principles by building a real, working application.

- Manages a single Person Card with three fields: name, age, and city.
- Supports full CRUD operations through simple console commands: add, show, update, del, help, and exit.
- Validates all user input (empty name, age limits, minimum city length) and shows clear error messages.
- Runs in an infinite command loop and allows any operation to be cancelled by typing 'done'.

---


## Features

| Function | Description |
|----------|-------------|
| add | Creates a new Person Card with name, age, and city. |
| show | Displays the current Person Card data, or shows that it is empty. |
| update | Updates the existing Person Card data with new validated input. |
| del | Deletes the Person Card after user confirmation. |
| help | Shows the list of all available commands. |
| exit | Closes the application. |
| done | Cancels the current add or update operation |

---


## Project objective

This project is a personal learning exercise. It is not built to solve any specific real-world problem, but to practice and improve software design skills on a small, real codebase.

- Understand and apply Layered Architecture in practice.
- Practice the SOLID principles on a real, working example.
- Get hands-on experience with Java 17 and Maven.
- Keep the code clean, simple, and easy to reason about.

---


## Technologies

| Technology | Version | Objective |
|------------|---------|-----------|
| Java  |  17  |  Main programming language used to build the application. |
| Maven  |  3.8.7  |  Build and dependency management tool. |
| JUnit  |  5.9.2  |  Unit testing framework for writing and running tests. |

---


## Installation and Execution

### Windows
```cmd
 git clone https://github.com/masharipov2105/person-card-app.git

 cd person-card-app

 mvn clean package

 java -jar target/personal-card-1.0.0.jar

```
---


### Linux/Mac
```bash
 git clone https://github.com/masharipov2105/person-card-app.git

 cd person-card-app

 mvn clean package

 java -jar target/personal-card-1.0.0.jar

```
---


## Project view

![Home](https://raw.githubusercontent.com/masharipov2105/person-card-app/refs/heads/main/screenshots/img1.png)
![Home](https://raw.githubusercontent.com/masharipov2105/person-card-app/refs/heads/main/screenshots/img2.png)
![Home](https://raw.githubusercontent.com/masharipov2105/person-card-app/refs/heads/main/screenshots/img3.png)

---


## Project Structure

```cmd
person-card-app/
├── screenshots/
│   ├── img1.png
│   ├── img2.png
│   └── img3.png
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── masharipov2105/
│   │   │           └── systems/
│   │   │               ├── controller/
│   │   │               │   └── PersonController.java
│   │   │               ├── models/
│   │   │               │   ├── PersonModel.java
│   │   │               │   ├── RequestModel.java
│   │   │               │   └── ResponseModel.java
│   │   │               ├── repository/
│   │   │               │   ├── CardRepository.java
│   │   │               │   └── CardRepositoryImpl.java
│   │   │               ├── services/
│   │   │               │   ├── CardService.java
│   │   │               │   └── CardServiceImpl.java
│   │   │               └── Main.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── masharipov2105/
│                   └── systems/
│                       ├── models/
│                       │   ├── PersonModelTest.java
│                       │   ├── RequestModelTest.java
│                       │   └── ResponseModelTest.java
│                       ├── repository/
│                       │   └── CardRepositoryTest.java
│                       ├── services/
│                       │   └── CardServiceImplTest.java
│                       └── MainTest.java
├── target/
│   ├── classes/
│   │   ├── com/
│   │   │   └── masharipov2105/
│   │   │       └── systems/
│   │   │           ├── controller/
│   │   │           │   └── PersonController.class
│   │   │           ├── models/
│   │   │           │   ├── PersonModel.class
│   │   │           │   ├── RequestModel.class
│   │   │           │   └── ResponseModel.class
│   │   │           ├── repository/
│   │   │           │   ├── CardRepository.class
│   │   │           │   └── CardRepositoryImpl.class
│   │   │           ├── services/
│   │   │           │   ├── CardService.class
│   │   │           │   └── CardServiceImpl.class
│   │   │           └── Main.class
│   │   └── application.properties
│   ├── generated-sources/
│   │   └── annotations/
│   ├── generated-test-sources/
│   │   └── test-annotations/
│   ├── maven-archiver/
│   │   └── pom.properties
│   ├── maven-status/
│   │   └── maven-compiler-plugin/
│   │       ├── compile/
│   │       │   └── default-compile/
│   │       │       ├── createdFiles.lst
│   │       │       └── inputFiles.lst
│   │       └── testCompile/
│   │           └── default-testCompile/
│   │               ├── createdFiles.lst
│   │               └── inputFiles.lst
│   ├── surefire-reports/
│   │   ├── com.masharipov2105.systems.MainTest.txt
│   │   ├── com.masharipov2105.systems.models.PersonModelTest.txt
│   │   ├── com.masharipov2105.systems.models.RequestModelTest.txt
│   │   ├── com.masharipov2105.systems.models.ResponseModelTest.txt
│   │   ├── com.masharipov2105.systems.repository.CardRepositoryTest.txt
│   │   ├── com.masharipov2105.systems.services.CardServiceImplTest.txt
│   │   ├── TEST-com.masharipov2105.systems.MainTest.xml
│   │   ├── TEST-com.masharipov2105.systems.models.PersonModelTest.xml
│   │   ├── TEST-com.masharipov2105.systems.models.RequestModelTest.xml
│   │   ├── TEST-com.masharipov2105.systems.models.ResponseModelTest.xml
│   │   ├── TEST-com.masharipov2105.systems.repository.CardRepositoryTest.xml
│   │   └── TEST-com.masharipov2105.systems.services.CardServiceImplTest.xml
│   ├── test-classes/
│   │   └── com/
│   │       └── masharipov2105/
│   │           └── systems/
│   │               ├── models/
│   │               │   ├── PersonModelTest.class
│   │               │   ├── RequestModelTest.class
│   │               │   └── ResponseModelTest.class
│   │               ├── repository/
│   │               │   └── CardRepositoryTest.class
│   │               ├── services/
│   │               │   └── CardServiceImplTest.class
│   │               └── MainTest.class
│   ├── original-personal-card-1.0.0.jar
│   └── personal-card-1.0.0.jar
├── dependency-reduced-pom.xml
├── pom.xml
└── README.md
```
---


## License

This project is open source and released under the MIT License. Anyone is free to use, copy, modify, merge, publish, distribute, sublicense, and sell copies of the software, as long as the original copyright notice and permission notice are included. The software is provided "as is", without warranty of any kind.

---


## Author

- Github : [masharipov2105](https://github.com/masharipov2105)

- Telegram : [masharipov2105](https://t.me/masharipov2105)

- Gmail : masharipov2105@gmail.com


