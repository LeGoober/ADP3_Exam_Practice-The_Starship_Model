# Apollo13 - Galactic Trading System

## Overview
Apollo13 is a Java-based Maven project implementing a **Galactic Trading System** using **Domain-Driven Design (DDD)** principles. It models a network of spaceships, starports, trade contracts, and navigation logs, designed to practice DDD concepts, SOLID principles, and design patterns (Singleton, Builder, Factory, Repository) for the Applications Development Practice (ADP) module 4-hour coding exam.

## Project Structure
The project follows a DDD architecture with the following packages under `za.ac.cput`:
- **domain**: Entity classes (Spaceship, Starport, TradeContract, NavigationLog, Cargo, TradeRoute, Crew).
- **util**: Utility class (GalacticHelper) for validation (e.g., `isValidShipId`, `isValidCargoWeight`).
- **factory**: Builder for complex object creation (SpaceshipBuilder).
- **repository**: Singleton repositories with interfaces for data storage (e.g., SpaceshipRepository, IStarportRepository).
- **service**: Business logic layer (e.g., SpaceshipService, StarportService).
- **controller**: RESTful controller (GalacticController) for external interactions.

### Key Features
- **Entities and Relationships**:
    - **Spaceship**: Aggregates Cargo, TradeRoute, Crew, Starport (home port).
    - **Starport**: Represents docking hubs, linked to Spaceships and TradeContracts.
    - **TradeContract**: Aggregates Spaceship and Starport, defines trade terms.
    - **NavigationLog**: Aggregates TradeRoute, logs journey details.
- **SOLID Principles**:
    - Single Responsibility: Each class has one role.
    - Open-Closed: Extensible via Builder and interfaces.
    - Liskov Substitution: Repositories use interfaces.
    - Interface Segregation: Split repository interfaces (e.g., ISpaceshipRepository, ISpaceshipQuery).
    - Dependency Inversion: Services depend on abstractions.
- **Design Patterns**:
    - Singleton: Ensures one repository instance per entity.
    - Builder: SpaceshipBuilder for flexible Spaceship creation.
    - Repository: Manages data access with in-memory Lists.
- **Composition**: Controller owns Services, Services own Repositories.
- **Aggregation**: Entities share lifecycles (e.g., Spaceship → Starport).

## Prerequisites
- **JDK 21** (LTS version, install via [Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)).
- **IntelliJ IDEA** (Community or Ultimate with CPUT license; see Blackboard for setup).
- **Maven**: Included in IntelliJ or install via [Apache Maven](https://maven.apache.org/download.cgi).
- **Git**: For version control (see Blackboard Git videos).

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone <your-repo-url>
   cd Apollo13


Open in IntelliJ:
Import as a Maven project.
Ensure JDK 21 is configured (File > Project Structure > SDKs).


Update pom.xml:Add dependencies for testing (e.g., JUnit) and utilities (e.g., Apache Commons for validation):<dependencies>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.13.2</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.apache.commons</groupId>
<artifactId>commons-lang3</artifactId>
<version>3.12.0</version>
</dependency>
</dependencies>


Build the Project:mvn clean install


Run Tests:Create unit tests in src/test/java for repositories and services (e.g., SpaceshipRepositoryTest).mvn test



Usage

Coding Practice:
Implement domain classes (src/main/java/za/ac/cput/domain/*.java) with attributes, constructors, getters, setters, toString().
Code utility methods in GalacticHelper (e.g., regex for isValidShipId).
Implement Singleton repositories with List-based CRUD.
Use SpaceshipBuilder for creating Spaceship instances.
Write service methods for business logic (e.g., assignPort in SpaceshipService).
Simulate REST endpoints in GalacticController.


Exam Preparation:
Practice translating UML to Java code under time constraints.
Focus on clean code, proper package structure, and TDD (unit tests for repositories/services).
Test edge cases (e.g., invalid shipId, null cargo).



UML Diagram
The system is modeled in GalacticTradingSystem_UML.puml. Visualize it using PlantUML. Key relationships:

Aggregation: Spaceship → Cargo, TradeRoute, Crew, Starport; TradeContract → Spaceship, Starport; NavigationLog → TradeRoute.
Composition: Controller → Services → Repositories.
Interfaces: ISpaceshipRepository, IStarportRepository, ITradeContractRepository for abstraction.

Notes

Package Naming: Use za.ac.cput as the reverse domain name convention.
TDD: Write tests first for repository CRUD operations and service logic.
Maven: Use mvnrepository.com to find dependencies (e.g., Apache Commons for validation).
Git: Commit changes regularly and push to GitHub (see .gitignore for IntelliJ files).

Author
Prepared for ADP module practice, inspired by galactic trading themes. Contact your lecturer or class rep for support.

Copyright reserved 2025. Inspired by Kruben Naidoo's ADP372S lesson plans.```
