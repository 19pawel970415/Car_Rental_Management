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
6. **Decorator:** Implement the Decorator pattern to enrich information about rented cars:
   - **CarInfoProvider Interface:** Extend the `Car` class by implementing the `CarInfoProvider` interface.
   - **CarInsuranceDecorator:** Create a decorator that adds information about the car's insurance.
   - **GPSDecorator:** Create a decorator that adds information about whether the car has a GPS system.
7. **Facade:** Implement the Facade pattern to simplify the reservation management process:
   - **ReservationProcessFacade:** Create a class `ReservationProcessFacade` that coordinates the reservation process by interacting with the following components:
      - **CarAvailabilityService:** For checking car availability.
      - **ExternalPaymentAdapter:** For handling payments.
      - **ReservationConfirmation:** For confirming reservations.
   - **Interface:** The `ReservationProcessFacade` class should have a method `reserve(Car car, Payment payment)`.
8. **Proxy:** Implement the Proxy pattern for user authorization:
   - **ReservationServiceProxy:** Implement the `ReservationServiceProxy` class, which acts as a proxy for `ReservationService`.
      - **Interface:** `ReservationServiceProxy` should implement the `ReservationService` interface.
      - **Logic:** Add logic to check user authorization before executing the `isAuthorized` method. Users from Germany have restricted access to foreign markets.
9. **Iterator:** Implement the Iterator pattern for employee iteration:
   - **EmployeeIterator:** Implement the `EmployeeIterator` class, which provides iteration functionality for the `EmployeesRepo` class.
      - **Interface:** `EmployeeIterator` implements the `Iterator<Employee>` interface.
      - **Logic:** Ensure iteration through the employees array in the `EmployeesRepo` class. The iterator supports standard iteration methods: `hasNext()` to check if there are more elements, and `next()` to retrieve the next employee. The implementation provides a way to traverse through the collection without exposing the underlying data structure.
10. **Observer:** Implement the Observer pattern for employee notifications:
   - **Abstract Employee Class:** Create an abstract `Employee` class with methods for handling messages and notifying observers.
   - **Concrete Observers:** Implement concrete classes `Manager` and `RentalRepresentative` that extend the abstract `Employee` class. These classes define specific behaviors for handling messages.
   - **GroupChat Subject:** Implement the `GroupChat` class as a subject that manages a list of employees (observers) and notifies them of new messages. It should include methods for adding and removing employees and sending messages.
   - **Interaction:** Demonstrate how messages are sent and received by implementing the `Main` class. This class should illustrate how messages are distributed to employees based on their types and how each employee handles them.

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
6. **Decorator:** Implement the Decorator pattern to enrich information about rented cars:
   - **CarInfoProvider Interface:** Extend the `Car` class by implementing the `CarInfoProvider` interface.
   - **CarInsuranceDecorator:** Create a decorator that adds information about the car's insurance.
   - **GPSDecorator:** Create a decorator that adds information about whether the car has a GPS system.
7. **Facade:** Implement the Facade pattern to simplify the reservation management process:
   - **ReservationProcessFacade:** Create a class `ReservationProcessFacade` that coordinates the reservation process by interacting with the following components:
      - **CarAvailabilityService:** For checking car availability.
      - **ExternalPaymentAdapter:** For handling payments.
      - **ReservationConfirmation:** For confirming reservations.
   - **Interface:** The `ReservationProcessFacade` class should have a method `reserve(Car car, Payment payment)`.
8. **Proxy:** Implement the Proxy pattern for user authorization:
   - **ReservationServiceProxy:** Implement the `ReservationServiceProxy` class, which acts as a proxy for `ReservationService`.
      - **Interface:** `ReservationServiceProxy` should implement the `ReservationService` interface.
      - **Logic:** Add logic to check user authorization before executing the `isAuthorized` method. Users from Germany have restricted access to foreign markets.
9. **Iterator:** Implement the Iterator pattern for employee iteration:
   - **EmployeeIterator:** Implement the `EmployeeIterator` class, which provides iteration functionality for the `EmployeesRepo` class.
      - **Interface:** `EmployeeIterator` implements the `Iterator<Employee>` interface.
      - **Logic:** Ensure iteration through the employees array in the `EmployeesRepo` class. The iterator supports standard iteration methods: `hasNext()` to check if there are more elements, and `next()` to retrieve the next employee. The implementation provides a way to traverse through the collection without exposing the underlying data structure.
10. **Observer:** Implement the Observer pattern for employee notifications:
   - **Abstract Employee Class:** Define an abstract `Employee` class with methods for handling messages and notifying observers.
   - **Concrete Observers:** Create concrete classes `Manager` and `RentalRepresentative` extending the `Employee` class, specifying how each handles messages.
   - **GroupChat Subject:** Implement the `GroupChat` class to act as a subject managing the list of employees (observers). This class should handle adding and removing employees, and notifying them with new messages.
   - **Interaction:** Demonstrate the Observer pattern in the `Main` class, showing how messages are sent to employees and processed based on their type.

### Interfaces and Implementations
1. **Interfaces:** Define interfaces for `Car`, `User`, `Reservation`, and `Market`.
2. **Implementations:** Ensure that each class implementing an interface follows SOLID principles.

### Repositories
1. **Repositories:** Implement repositories for managing cars, markets, reservations, and users, ensuring they follow the Singleton pattern for instance management.

### Main Class
1. **Main Class:** Implement the `Main` class to run methods for generating cars, markets, reservations, and users, and demonstrate the dynamic wrapping of `Car` objects using decorators. Ensure that the Observer pattern is demonstrated by managing messages sent to employees and handling them based on their type.

## Objective
The task aims to assess your skills in:
1. Designing and implementing the required classes, interfaces, enums, and repositories.
2. Applying design patterns, good coding practices, and SOLID principles effectively.
