# Car Rental Company

## Context
The task is to design and implement a reservation management system for a car rental company. This system should be based on design patterns, SOLID principles, and good coding practices.

## Requirements

### Functionalities
1. **Car Reservation**: Allow users to make car reservations.
2. **Adding Cars**: Add new cars to the database.
3. **Car Search**: Ability to search for cars by various criteria (e.g., make, model, type).
4. **User Management**: Register new users and manage their data.

### Technical Requirements

#### Design Patterns
1. **Singleton**: Use the Singleton pattern to manage system configuration (e.g., database connection settings).
2. **Builder**: Use the Builder pattern to create reservation and car objects.
3. **Factory Method and Abstract Factory**: Apply Factory Method and Abstract Factory patterns to create and manage different types of cars (e.g., SUV, sedan).
4. **Prototype**: Use the Prototype pattern to clone reservation objects for quick creation of similar reservations.

#### Good Practices
1. **Clean Code**: Ensure code readability by applying the Single Responsibility Principle (SRP) and using appropriate naming.
2. **DRY**: Avoid code duplication by using helper methods and classes.
3. **KISS**: Keep code simple and understandable. Avoid unnecessary complexity.
4. **YAGNI**: Implement only the functionalities that are currently needed. Avoid adding features “just in case.”
5. **SOLID**: Apply SOLID principles throughout the system, especially in terms of extensibility and maintainability.

### Task

#### Data Modeling
- Create models for cars, reservations, and users. Use the Builder pattern to construct these objects.

#### Pattern Implementation
1. **Singleton**: Implement a class to manage configuration with a single instance.
2. **Factory Method**: Create factories to generate cars of various types.
3. **Abstract Factory**: Use the Abstract Factory pattern to create groups of cars and reservations (e.g., different types of cars for different markets).
4. **Prototype**: Use the Prototype pattern to clone reservation objects.

#### Interfaces and Implementations
- Implement interfaces for reservations, cars, and users. Ensure that each class implementing an interface adheres to SOLID principles.

#### User and Reservation Management
- Implement functionalities for adding, searching, and managing cars and users. Enable creation and management of reservations.

#### Testing
- Write unit and integration tests to verify the correctness of the system. Tests should cover all major functionalities and check the correct implementation of design patterns.

#### Documentation
- Prepare technical documentation describing the design patterns used, SOLID principles, and good coding practices. Explain how each requirement was implemented and what patterns were used.

## Objective
The task aims to assess your skills in:
- Designing a system according to design patterns.
- Applying good coding practices and SOLID principles.
