# 🧑‍💼 Employee Management System - Spring Boot CRUD Application

This is a simple **Spring Boot CRUD REST API** for managing employees. The project follows a clean layered architecture and uses an **H2 in-memory database**. All standard CRUD operations are implemented with proper HTTP responses and exception handling.

---

## 📋 Assignment Scope

### ✅ Features Implemented:
- Create an Employee (`POST /employees`)
- Retrieve All Employees (`GET /employees`)
- Retrieve Employee by ID (`GET /employees/{id}`)
- Update Employee details (`PUT /employees/{id}`)
- Delete Employee by ID (`DELETE /employees/{id}`)

### 👨‍💼 Employee Fields:
- `name` (String)
- `email` (String) – must be unique
- `department` (String)
- `salary` (double)

### 💡 Technologies Used:
- Java 17+
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Postman (for testing)
- Maven

---

## ⚙️ Project Architecture

---

## 📦 API Endpoints

| Method | Endpoint              | Description               |
|--------|-----------------------|---------------------------|
| POST   | `/employees`          | Create a new employee     |
| GET    | `/employees`          | Get all employees         |
| GET    | `/employees/{id}`     | Get employee by ID        |
| PUT    | `/employees/{id}`     | Update employee by ID     |
| DELETE | `/employees/{id}`     | Delete employee by ID     |

---

## 📥 Sample JSON Payload (Create / Update Employee)

```json
{
  "name": "Nayem Uddin",
  "email": "nayem@gigabit.agency",
  "department": "IT",
  "salary": 75000
}
```

## 🛡️ Exception Handling
Handled using @RestControllerAdvice with custom exceptions and consistent response format.

### Example Response on Error Not Found:
```json
{
  "success": false,
  "message": "Employee not found with ID: 5",
  "data": null
}
```

### Validation Errors:
```json
{
  "success": false,
  "message": "Validation failed",
  "data": {
    "email": "Email is required",
    "salary": "Salary must be greater than 0"
  }
}
```

## 🧪 Testing
Use Postman to test all API endpoints.

Base URL: http://localhost:8080/employees

Content-Type: application/json

Use raw body with JSON data for POST and PUT.


## 🛠️ How to Run
### 1. Clone the project:
``` bash
- git clone https://github.com/yourusername/employee-management.git 
```
### 2. Navigate into the project directory:

```bash
- cd employee-management
```

### 3. Run the project:

```bash
- ./mvnw spring-boot:run
```

### 4. Access H2 Console (for dev/testing):

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

## 🎯 Success Criteria
✅ All 5 APIs functional and return proper HTTP responses

✅ Data is stored in and retrieved from H2 DB

✅ Code compiles and runs without errors

✅ APIs fully testable via Postman

✅ Validation and exceptions handled gracefully

## 📃 License
This project is developed for educational purposes as part of an assignment on Spring Boot REST API.


