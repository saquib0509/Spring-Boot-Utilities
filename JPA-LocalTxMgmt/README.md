# 🏦 Spring Boot Banking Transaction Demo

A simple Spring Boot project that demonstrates **local transaction management** using **Spring Data JPA**.  
It simulates basic banking operations such as **Deposit**, **Withdrawal**, and **Fund Transfer** between accounts — with proper transaction rollback support.

---

## 🚀 Features

- 🔄 Demonstrates **Transaction Management** using Spring Boot and JPA  
- 💰 Shows how money transfer between two accounts works safely  
- ⚙️ Automatically **rolls back** if any operation fails  
- 🧩 Uses `@Transactional` for atomic fund transfer  

---

## 🧠 Project Overview

**Entity:** `BankAccount.java`  
Represents a bank account with account number, holder name, and balance.

**Repository:** `IBankAccountRepository.java`  
Extends `JpaRepository` to handle all database operations.

**Service:** `BankMgmtServiceImpl.java`  
Contains logic for:
- `withdraw()`
- `deposit()`
- `transfer()` (marked with `@Transactional`)

**Runner:** `LocalTxMgmtRunner.java`  
Automatically runs at startup to test fund transfer operations.

---

## 🧪 Test Scenarios

Below are three possible outcomes when running the project.  
(📸 I’ll attach database screenshots for each case.)

---
* Initial Database Screenshot:*  
<img width="355" height="77" alt="image" src="https://github.com/user-attachments/assets/aa506172-fab4-4960-8b16-b7e0e298338a" />

### 🟢 **1️⃣ Successful Transfer**
**Condition:** Both source and destination accounts exist.

**Result:**
- Amount **deducted** from source account  
- Amount **added** to destination account  
- Transaction committed successfully ✅

* Database Screenshot:*  
<img width="342" height="87" alt="image" src="https://github.com/user-attachments/assets/b436d55c-e19f-4bc8-a1bc-c6a90f5b3bb8" />

<img width="672" height="32" alt="image" src="https://github.com/user-attachments/assets/4a708b6e-b4f3-48ce-8ab7-3d03778fb089" />


### 🔴 **2️⃣ Invalid Account (Rollback Triggered)**
**Condition:** Destination account does not exist or invalid account number entered.

**Result:**
- Source amount **NOT deducted**  
- Transaction **rolled back completely**  
- Data remains unchanged 🛑

*Screenshot:*  
<img width="727" height="36" alt="image" src="https://github.com/user-attachments/assets/d8a5a8be-59b4-4e60-9907-42d08baa0606" />

<img width="342" height="87" alt="image" src="https://github.com/user-attachments/assets/b436d55c-e19f-4bc8-a1bc-c6a90f5b3bb8" />


### 🟡 **3️⃣ Without @Transactional (for learning only)**
**Condition:** `@Transactional` annotation removed from `Transfer()` method.

**Result:**
- Amount **deducted** from source account ❌  
- Amount **NOT added** to destination account  
- Database becomes inconsistent ⚠️

*Screenshot:*  
<img width="727" height="36" alt="image" src="https://github.com/user-attachments/assets/b82b85bd-17d3-42ba-a71c-6338578df734" />
<img width="352" height="80" alt="image" src="https://github.com/user-attachments/assets/cc133bac-24f7-4466-8edf-d155b15d0260" />


### 💡 Takeaway
`@Transactional` ensures **atomicity** —  
> Either *both operations succeed* or *none at all.*
