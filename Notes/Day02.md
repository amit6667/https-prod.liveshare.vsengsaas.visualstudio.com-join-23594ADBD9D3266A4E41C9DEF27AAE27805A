01/06/2021

# Recap

- Github Repository
- Scoop
- Dependency Injection
- VSCode
    - Live Share
- Paradigms
- STS
- Wiring 
- Corretto
- JDK
- Vendors
- Configuring Corretto for
- Maven Installation
- Spring Boot Annotations
- OOPs
    - Inheritance
    - Polymorphism
    - Encapsulation
- Declarative Programming
- Imperative Programming
- ApplicationContext
    - getBean method
- Coupling

# The Spring Framework

Timestamp: 09:53

## Raw

- It is an open source framework
- DispatcherServlet 
- Most Popular Application Development Framework
- Loose Coupling
- Dependency Injection
- Light Weighted
- IOC container
- Used for Enterprise Applications
- Testable
- Modular
- AOP
- Flexible
- Security
- Internationalization
- ORM
- Provides a lot of Abstractions
- Hibernate Template
- jdbc
- mvc framework
- Easy integration with different technologies
- MVC Design Pattern
- WebSocket
- IoC manages the lifecycle of a bean

# Industrial Programming

- Not a Common Term
- Programming is done in a Software Industry
- A Developer stays in a Company for 2-3years
- 6 months - 3 years
- A Developer can leave a company in between
- Another Developer will come take his/her place

- Code is read way more times than it is written
- clean code over efficient code

## Issues

- Flow of Execution of Code
- Why are some Classes their?
- Which Versions?
- Which packages and plugins are used?
- How to use them?
- How does it work?

## History of Software

- Model Views Controllers
- Object Oriented Programming
- Layered Architecture
    - Presentation Layer
    - Business Layer
    - Persistence Layer
    - Database Layer

https://www.youtube.com/watch?v=6wDoopbtEqk

## Trainer's thoughts

- Application Development Framework
    - lot of libraries to abstract repititive tasks
- Provides Features for Dependency Injection
- Loose Coupling: Level of Dependency between dependency
- DI
- IoC container
- Configuration over Code


# Spring Boot

- Convention over Configuration

# Dependency Injection

Timestamp: 11:24

- Apparently only inside a bean you can autowire

# Bean Scope

By default spring will only create one object, and pass it on everyautowire
This is known as singleton scope.

- singleton: spring will maintain a single object on every autowire
- prototype: spring will create a new object on every autowire


# Demo

1. Demo Class
2. Run Method in Demo class
3. Annotated Demo class with Component
4. I used ctx in Main to get bean of demo
5. I ran the run() method of demo
6. I created a Lockdown1 class
7. I created a property of type String named duration
8. I gave it a default value
9. I autowired it inside my demo class
10. I ran the printDuration method inside my demo class
11. I changed the duration property, and reran my program
12. I did another autowiring
13. Then I tested the scope.

# Open Discussion: Benefits of Interfaces

Timestamp: 12:20

## Raw

- Multi Inheritance
- Abstraction
- Avoid Boilerplate Code
- Loosely Coupled
- Incomplete methods
- no need to repeat code
- one layer changes did not affect another layer

## Contract

- Agreement
- You always have to follow it


# Use

- Interface are most commonly used as contracts that should not be violated


# Demo

1. Created a Lockdown interface
2. I made Lockdown1 class implement interface
3. And I autowired the interface


# Two classes that implement an interface

Timestamp: 12:52

Practice it from the recording

# Types of DI

Timestamp: 14:10

- Constructor Injection
- Setter Injection
- Property Injection

# Flow for remaining course

MVC
HTTP API
CRUD
REST API


# MVC

Timestamp: 15:04

## Raw

MVC came out in 1979
Java came out in 1989
HTTP came out in 1991


- Model 
    - Business Class?
    - Dao Class?
    - Logic related to service is written in this
    - JPA Repository
    - Represents Data
- View
    - JavaScript
    - User Interfaces
    - JSP
    - Thymeleaf
    - many more...
    - Representation of data for users
- Controller
    - @RequestMapping
    - Handles HTTP Request and Response.
    - Flow of code execution


## MVC

Timestamp: 15:12

- Code Organization
- Model: All code that conforms to Data Definition Language, and Data Manipulation Language
- Controller:
    - Handles Requests
    - Executes Logic on the Basis of Requests
    - Returns a Response
- View:
    - To present response to the user in an interactive


- Services

## HTTP vs REST vs API

TimeStamp: 15:19

- HTTP
    - Protocol for communication
- Rest
    - Architectural Style
    - Constraints
- API
    - Black Box
    - Group of Interfaces
    - JDK has a lot of APIs
    - Application Programming Interface
    - Functional
    - Network Based: HTTP API

- HTTP APIs
    - That you can use over HTTP

- REST

# Flow

- HTTP API
- CRUD
- RESTful API

# HTTP API

Timestamp: 16:05

Spring MVC: Still had a lot of BoilerPlate
Spring Web: More abstraction to MVC and uses Spring MVC


Spring Initializr: https://start.spring.io/


## HTTP Request Methods

- Get
- POST
- Delete
- PUT

# Postman

```
scoop search postman
scoop bucket add extras
scoop install postman
```