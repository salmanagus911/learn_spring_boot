# Spring Boot: Up and Running - Learning Codes

This repository contains my learning projects and exercises derived from the book **"Spring Boot: Up and Running"** by **Mark Heckler**. This serves as a personal collection to track my progress and enhance my understanding of Spring Boot through practical application.

## Repository Structure

The repository is organized by chapters and sections, mirroring the structure of the book for easy navigation and reference. Each folder represents a specific chapter or concept, and contains:

- **Source Code**: Java and Spring Boot application files.
- **Resources**: Supporting materials such as configuration files or documentation links.

### Example Structure
```
├── Chapter-01-Introduction
│   ├── hello-springboot
│       ├── src
│       └── pom.xml
├── Chapter-02-SpringBoot-Basics
│   ├── simple-rest-api
│       ├── src
│       └── pom.xml
└── Chapter-03-Data-Access
    ├── spring-data-jpa-demo
        ├── src
        └── pom.xml
```

## Getting Started

### Prerequisites
To run the code in this repository, ensure you have the following:

- **Java Development Kit (JDK)** version 17 or higher
- **Maven** (for dependency management and builds)
- An IDE such as IntelliJ IDEA or Eclipse for running the projects

### Running a Project
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/spring-boot-learning.git
   cd spring-boot-learning
   ```
2. Navigate to the desired project directory, e.g., `Chapter-02-SpringBoot-Basics/simple-rest-api`.
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application via the specified port, typically `http://localhost:8080`.

## Topics Covered

This repository explores key concepts from the book, including but not limited to:

1. **Spring Boot Basics**: Getting started with Spring Boot, application structure, and configuration.
2. **RESTful APIs**: Building and testing REST endpoints.
3. **Data Access**: Integrating databases using Spring Data JPA and H2.
4. **Actuator**: Monitoring and managing applications with Spring Boot Actuator.
5. **Testing**: Writing unit and integration tests.
6. **Security**: Securing applications using Spring Security.
7. **Deployment**: Packaging and deploying Spring Boot applications.

## Notes and Reflections
Throughout the learning process, I’ve included personal notes, challenges faced, and key takeaways in the respective README files of each chapter. These notes aim to provide additional context and serve as a reference for future projects.

## Contributing
While this is primarily a personal learning repository, contributions are welcome! Feel free to:

- Submit issues if you find bugs.
- Share ideas or improvements for existing projects.
- Open pull requests with new examples or enhancements.

## Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Book: Spring Boot: Up and Running](https://www.oreilly.com/library/view/spring-boot-up/9781492076988/)

## License
This repository is licensed under the [MIT License](LICENSE). Feel free to use the code for learning and personal projects.

