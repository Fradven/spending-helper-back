# 🚀 Project Setup & Installation

This is the back-end of the application built with Spring Boot.

## 📦 Installation
1. **Clone the repository**  
   ```sh
   git clone https://github.com/your-repo/backend.git
   cd backend
   ```

2. **Ensure you have Java & Maven installed**  
   - Java 17+ is recommended
   - Maven 3.8+ is required

## 🛠 Database Configuration
Before running the project, ensure you have a database set up.

Edit the `src/main/resources/application.properties` file to configure your database connection:

```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Replace the values with your actual database credentials.

## ▶️ Running the Project
To start the back-end, run:

```sh
mvn spring-boot:run
```

This will launch the back-end at [http://localhost:8080](http://localhost:8080).

For production:
```sh
mvn clean package
java -jar target/your-app.jar
```
