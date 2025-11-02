# 🧩 Spring Boot JPA Collection Mapping Demo

A **Spring Boot + JPA** project demonstrating how to map **collections (List, Set, Map)** inside an entity using the `@ElementCollection` and `@CollectionTable` annotations.  
This project shows how to store and retrieve **multiple related values** (friends, phone numbers, IDs) linked to a single employee entity.

---

## 🧠 Project Overview

This mini project demonstrates **one-to-many-style relationships** without using separate entity classes — by mapping collection properties directly in the entity using JPA annotations.

**Entity:** `Employee.java`  
Represents an employee having:
- Basic details: name, address  
- A list of friends (List<String>)  
- A set of phone numbers (Set<Long>)  
- A map of ID details (Map<String, Integer>)

**Repository:** `IEmployeeRepository.java`  
Extends `JpaRepository<Employee, Integer>` to handle CRUD operations.

**Service:** `EmployeeMgmtServiceImpl.java`  
Implements methods to:
- Register a new employee  
- Retrieve and display all employee records  

**Runner:** `CollectionMappingTestRunner.java`  
Used to insert or retrieve employee data automatically when the project runs.

---

## 🧩 Features

- 💡 Demonstrates **@ElementCollection** and **@CollectionTable** mappings  
- 🧱 Shows how to map `List`, `Set`, and `Map` in a single entity  
- 🔗 Automatically creates **child tables** for each collection  
- 📦 Uses **Spring Data JPA** for persistence  
- 🧰 Includes `@RequiredArgsConstructor` and `@SequenceGenerator` for entity handling  
- 🧾 Demonstrates how JPA handles **embedded collections** in relational tables  

---

## 🛠️ Tech Stack

☕ **Java:** 21  
🚀 **Spring Boot:** 3.5.7  
🗃️ **Spring Data JPA**  
🧩 **Hibernate ORM**  
🧾 **H2 / MySQL Database (configurable)**  
🏷️ **Lombok**  
📦 **Maven**

---

## ⚙️ How It Works

When an `Employee` object is saved, **four tables** are automatically created:

| Table Name | Description |
|-------------|--------------|
| `EMPLOYEE_CM` | Parent table storing employee main details |
| `FRIENDS_INFO` | Stores all friends (List) linked to employee |
| `PHONE_INFO` | Stores phone numbers (Set) linked to employee |
| `IDENTITY_INFO` | Stores key-value ID details (Map) |

<img width="200" height="115" alt="Screenshot 2025-11-02 193722" src="https://github.com/user-attachments/assets/996a74ec-ee5b-48f5-bdd6-646fdd59332d" /> 

<img width="136" height="60" alt="Screenshot 2025-11-02 193643" src="https://github.com/user-attachments/assets/b69af9c9-c4a4-4974-b798-c4e110498801" />

<img width="145" height="90" alt="Screenshot 2025-11-02 193650" src="https://github.com/user-attachments/assets/d2c95a46-6d05-42e0-a8b9-59097a87520c" />

<img width="112" height="78" alt="Screenshot 2025-11-02 193705" src="https://github.com/user-attachments/assets/70c3a70d-671a-4e02-b77b-d306365ca00a" />

<img width="158" height="100" alt="Screenshot 2025-11-02 193658" src="https://github.com/user-attachments/assets/54313acf-4c6e-4182-950d-6e5eb42b6aef" />


Each child table uses a **foreign key (EMPID_FK)** that references the **primary key (EMPNO)** of the main table.



