# 🧾 Spring Boot CLOB & BLOB Data Handling Demo

A simple **Spring Boot** project demonstrating how to handle **large binary (BLOB)** and **character (CLOB)** data such as images and resumes in a database using **Spring Data JPA**.

---

## 🧩 Features

- 🧠 Demonstrates **CLOB** (Character Large Object) and **BLOB** (Binary Large Object) handling  
- 📸 Allows saving candidate **photo (image)** and **resume (text file)** into the database  
- ⚙️ Uses `@Entity`, `@Repository`, `@Service`, and `CommandLineRunner` for structured layering  
- 💾 Automatically creates tables using `spring.jpa.hibernate.ddl-auto=update`  
- 💬 Takes user input from the console (name, age, status, image path, resume path)  

---

## 🛠️ Tech Stack

☕ **Java:** 21  
🚀 **Spring Boot:** 3.5.7  
🗃️ **Spring Data JPA**  
🐬 **MySQL Database** (supports Oracle too)  
🏷️ **Lombok**  
📦 **Maven**

---

## 🧠 Project Overview

**Entity:** `Candidate.java`  
> Represents a candidate with name, age, marital status, photo (BLOB), and resume (CLOB).

**Repository:** `ICandidateRepository.java`  
> Extends `JpaRepository` to manage persistence automatically.

**Service:** `CandidateMgmtServiceImpl.java`  
> Contains the business logic to save candidate details into the database.

**Runner:** `LocalTxMgmtRunner.java`  
> Takes console input, reads image & resume files, and calls the service to store them.

---

## ⚙️ How It Works

1️⃣ User provides:  
- Name  
- Age  
- Marital status (`true/false`)  
- Image file path (photo)  
- Resume file path  

2️⃣ Code reads both files:  
- Image → as `byte[]` (BLOB)  
- Resume → as `char[]` (CLOB)

3️⃣ Data is saved using `CandidateRepository.save()`  
4️⃣ Success message shows candidate ID on the console.

---

## 🚀 How to Run

1️⃣ **Prerequisites:**  
- Java 17+ (or 21)  
- MySQL or Oracle Database  
- Maven  

<img width="943" height="379" alt="Screenshot 2025-10-27 224230" src="https://github.com/user-attachments/assets/1d48d719-38f0-4d7c-ac43-acafde3f7009" />

<img width="1188" height="325" alt="Screenshot 2025-10-27 224707" src="https://github.com/user-attachments/assets/fc54b5e5-1203-4a4e-b220-06669f2a7fb9" />

