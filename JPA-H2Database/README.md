# 🗃️ JPA-H2Database

This project demonstrates how to use **Spring Boot with JPA** and an **H2 In-Memory Database** for data persistence.  
It’s designed for beginners to understand how entities, repositories, and services interact in a Spring Boot application without requiring an external database setup.

---

## 📘 Overview

- Uses **Spring Data JPA** for ORM mapping  
- Runs entirely on **H2 In-Memory Database** (no installation needed)  
- Demonstrates simple **CRUD operations** using Repository and Service layers  
- H2 Console enabled for visualizing and verifying database tables

---


---

## ⚙️ Configuration Highlights

**application.properties**
```properties
spring.application.name=JPA-H2Database
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=5656
```
---

**✅ H2 Console Access:**

After running the app, open http://localhost:5656/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

<img width="1078" height="593" alt="Screenshot 2025-10-29 210424" src="https://github.com/user-attachments/assets/834cde46-9197-47f7-960d-c742388ab189" />


## 🧩 Features

- 🗃️ Store and retrieve data in an **in-memory H2 database**  
- 💡 Demonstrates use of `@Entity`, `@Repository`, and `@Service`  
- ⚙️ Shows how **JPA Repositories** simplify CRUD operations  
- 🧱 Automatically creates tables using `spring.jpa.hibernate.ddl-auto=update`


<img width="1098" height="628" alt="Screenshot 2025-10-29 000600" src="https://github.com/user-attachments/assets/90ff34a1-9c6b-4825-80c4-c1e196f3aef3" />

## 🛠️ Tech Stack

**Java:** 21  
**Spring Boot:** 3.5.7  
**Spring Data JPA**  
**H2 Database**  
**Lombok**  
**Maven**


