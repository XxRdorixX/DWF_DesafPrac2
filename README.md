# Book API - Living Letters

A RESTful web service developed with Spring Boot to manage the books of the fiction publishing house "Letras Vivas."
This API allows clients to perform basic operations such as listing, adding, searching, and deleting books.
The project follows a layered architecture and professional coding practices.
In our first project, it only managed a library; the system allows CRUD operations for creating, reading, updating, and deleting. But now, with the new additions, the system includes validations, error handling, the use of Hibernate and Spring Data, and Swagger documentation.

---

## Features

•	Retrieve all books.
•	Add a new book.
•	Search for books by title.
•	Update an existing book.
•	Delete a book by its ID.
•	Data validation in DTOs.
•	Centralized error handling.
•	Swagger UI interactive documentation.
•	Data persistence with H2 in-memory database.

---

## Technologies Used

- Java Zulu 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Lombok
- H2 in-memory databas
- Maven
- Postman (for testing)
- Swagger UI
---

## Project Structure

model → Book entity class.

config → Basic configuration for OpenAPI/Swagger.

dto → Data Transfer Objects with validation rules.

exception → Global exception handling.

repository → Interface extending JpaRepository.

service → Business logic (interface + implementation).

controller → REST endpoints.

resources → Configuration files (e.g., application.properties).

---

## How to Run the Project

1. Clone the repository
 ```
git clone https://github.com/your-username/DWF_DesafPrac2.git
cd DWF_DesafPrac2
   ```
3. Open the project

Open with IntelliJ IDEA.

3. Requirements

Java 17 (Zulu or any compatible JDK).

```
Maven installed.

  ```
4. Build the project
   
mvn clean install

6. Run the project

Option A (via IDE): Run BookApiApplication.java.
Option B (via terminal):
```
mvn spring-boot:run
```
6. Access the API

Base URL: http://localhost:8081/api/books

H2 Console: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:bookdb

User: sa

Password: (empty)

---

## Example Requests (Postman)

Get all books
GET http://localhost:8081/api/books

Create a new book
POST http://localhost:8081/api/books
Content-Type: application/json

```
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "publicationYear": 2008
}

```
Get book by ID
GET http://localhost:8081/api/books/1

Search books by title
GET http://localhost:8081/api/books/search?title=Programmer

Update a book
PUT http://localhost:8081/api/books/1
Content-Type: application/json

```
{
  "title": "Clean Coder",
  "author": "Robert C. Martin",
  "publicationYear": 2011
}

```
Delete a book
DELETE http://localhost:8081/api/books/1

---

## Swagger / OpenAPI Documentation

After running the application, the interactive documentation is available at:

Swagger UI: http://localhost:8081/swagger-ui/index.html

OpenAPI JSON: http://localhost:8081/v3/api-docs
