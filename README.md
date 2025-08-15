# Spring Pet Application 🐾

A simple Spring Boot application demonstrating **Spring Data JPA**, **H2 in-memory database**, and **RESTful endpoints** for managing pet records.

---
> **Note:** Most of my professional projects are proprietary and not publicly available. This repository features a representative code sample demonstrating my skills in Java, Spring Boot, and application architecture. Additional public projects will be added over time as they are prepared for sharing. I am also working on getting my Zeebe orchestration proof-of-concept project uploaded, which showcases workflow automation and event-driven microservices architecture.


## 🚀 Features
- **Spring Boot 3** with Maven/Gradle build
- **H2 in-memory database** for quick prototyping
- **Spring Data JPA** for CRUD operations
- Automatic schema generation
- Data initialization with `data.sql`
- H2 console enabled for database inspection

---

## 🛠️ Tech Stack
- **Java**: 17+
- **Spring Boot**: 3.x
- **Spring Data JPA**
- **H2 Database**
- **Lombok** (optional for boilerplate reduction)

---

## 📂 Project Structure

src/main/java/com/example/demo/pet

├── Pet.java # JPA entity

├── PetRepository.java # Spring Data JPA repository

├── PetController.java # REST controller

src/main/resources

├── application.properties

├── data.sql

yaml
## ⚙️ Getting Started

### 1. Clone the Repository

git clone https://github.com/YOUR_USERNAME/spring-pet-app.git
cd spring-pet-app

### 2. Run the Application

./gradlew bootRun
# or
mvn spring-boot:run

### 3. Access the H2 Console

Open http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

📡 API Endpoints
Method	Endpoint	Description
GET	/pets	List all pets

POST	/pets	Add a new pet

GET	/pets/{id}	Get pet by ID

PUT	/pets/{id}	Update pet

DELETE	/pets/{id}	Delete pet

📸 Screenshots
H2 Console

![h2pretestpetapplication](https://github.com/user-attachments/assets/0b389578-5319-4c6f-af53-0001c1691f22)

![testpassh2pretestpetapplication](https://github.com/user-attachments/assets/09fa9a18-dd74-4c5a-ab15-725336dc56d1)

📝 License
This project is licensed under the MIT License.

Author: Dr. Emma Seymour

📧 emmaseymour2027@gmail.com

💼 LinkedIn | 🌐 www.linkedin.com/in/dr-emma-seymour
