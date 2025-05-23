IntelliJ IDEA
Lombok
Postman
Spring DevTools

Backend Framework - Spring Boot
Database - MySQL
JPA Provider - Spring Data JPA (Hibernate)
Build Tool - Maven
Java Version - 21
Persistence Layer - JPA + Repository Pattern
Web Layer - Spring MVC (via Spring Boot)
Dependency Injection - Spring Framework

Project Architecture (Layered)
com.example.bookmanagement
├── entity          -> Book.java (JPA Entity)
├── repository      -> BookRepository.java (Data access layer)
├── service         -> BookService.java (Business logic)
├── controller      -> BookController.java (API endpoints)
└── BookManagementApplication.java (Main class)

Book Management System
A simple **CRUD REST API** for managing books, built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.

Features
- Create a new book
- Retrieve all books
- Retrieve a book by ID
- Update an existing book
- Delete a book by ID

Tech Stack

| Layer         | Technology           |
|---------------|----------------------|
| Backend       | Spring Boot, Spring Web |
| ORM           | Spring Data JPA (Hibernate) |
| Database      | MySQL                |
| Build Tool    | Maven                |
| Java Version  | Java 17+             |
| REST Client   | Postman / curl       |


Prerequisites
- Java 21
- Maven
- MySQL Server running locally
- IDE (IntelliJ, Eclipse, VS Code)

Database Setup

1. Open MySQL and create the database:
   ```sql
   CREATE DATABASE bookdb;
