# Car Rental Company: Simplified Task

## Context
The goal is to design and implement a reservation management system for a car rental company using design patterns, SOLID principles, and good coding practices. The focus is on creating the necessary classes, interfaces, enums, and repositories. Functional implementations like GUI are not required.

## Requirements

### Functionalities (For Implementation in Main)
1. **Generate Cars:** Populate the database with car instances.
2. **Generate Markets:** Populate the database with market instances.
3. **Generate Reservations:** Populate the database with reservation instances.
4. **Generate Users:** Populate the database with user instances.

### Technical Requirements

#### Design Patterns
1. **Singleton:** Implement the Singleton pattern to manage repository instances (`CarsRepo`, `MarketsRepo`, `ReservationsRepo`, `UsersRepo`).
2. **Builder:** Use the Builder pattern for creating complex `User` and `Reservation` objects.
3. **Factory Method:** Apply the Factory Method pattern for creating different types of Markets.
4. **Abstract Factory:** Use the Abstract Factory pattern to manage car factories and their products for different brands.
5. **Adapter:** Implement the Adapter pattern to integrate with a new external library for the payment system:
    - **PaymentService Interface:** Create a `PaymentService` interface with a method `processPayment(Order order)`.
    - **ExternalPaymentSystem:** Create a class `ExternalPaymentSystem` with its own payment methods, differing from your `PaymentService` interface.
    - **ExternalPaymentAdapter:** Create an `ExternalPaymentAdapter` class to adapt the `ExternalPaymentSystem` to the `PaymentService` interface.

#### Good Practices
1. **Clean Code:** Ensure code readability by applying the Single Responsibility Principle (SRP) and using meaningful names.
2. **DRY (Don't Repeat Yourself):** Avoid code duplication by employing helper methods and classes.
3. **KISS (Keep It Simple, Stupid):** Keep the code simple and understandable; avoid unnecessary complexity.
4. **YAGNI (You Aren't Gonna Need It):** Implement only the classes, interfaces, and methods that are necessary for the current requirements.
5. **SOLID:** Apply SOLID principles (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion) throughout the system.

## Task

### Data Modeling
1. **Create Models:** Design classes for `Car`, `User`, `Reservation`, and `Market`.
2. **Enums:** Define enums such as `Bundesland`, `Country`, `CarModel`, `CarType`, and others as needed.

### Pattern Implementation
1. **Singleton:** Implement the Singleton pattern for `CarsRepo`, `MarketsRepo`, `ReservationsRepo`, and `UsersRepo`.
2. **Builder:** Create users using Builder pattern.
3. **Factory Method:** Create `MarketFactory` interfaces and concrete implementations.
4. **Abstract Factory:** Use an Abstract Factory pattern for managing groups of car factories.
5. **Adapter:** Implement the Adapter pattern to integrate with a new external library for the payment system:
    - **PaymentService Interface:** Create a `PaymentService` interface with a method `processPayment(Order order)`.
    - **ExternalPaymentSystem:** Create a class `ExternalPaymentSystem` with its own payment methods, differing from your `PaymentService` interface.
    - **ExternalPaymentAdapter:** Create an `ExternalPaymentAdapter` class to adapt the `ExternalPaymentSystem` to the `PaymentService` interface.

### Interfaces and Implementations
1. **Interfaces:** Define interfaces for `Car`, `User`, `Reservation`, and `Market`.
2. **Implementations:** Ensure that each class implementing an interface follows SOLID principles.

### Repositories
1. **Repositories:** Implement repositories for managing cars, markets, reservations, and users, ensuring they follow the Singleton pattern for instance management.

### Main Class
1. **Main Class:** Implement the `Main` class to run methods for generating cars, markets, reservations, and users, demonstrating how the various components work together.

## Objective
The task aims to assess your skills in:
1. Designing and implementing the required classes, interfaces, enums, and repositories.
2. Applying design patterns, good coding practices, and SOLID principles effectively.
