
# Library Management System

A microservices-based **Library Management System** built using **Spring Boot**, **MySQL**, **Lombok**, and **Bootstrap** for managing books, authors, publishers, and categories. This application is designed with the capabilities of adding, editing, and deleting books along with managing related entities such as authors, publishers, and categories. The system is developed with a modern architecture, responsive UI, and works with **Java 17 or higher**.

## Features

- **Author Management**: Add, edit, and delete authors.
- **Category Management**: Add, edit, and delete book categories.
- **Publisher Management**: Add, edit, and delete publishers.
- **Book Management**: Add, edit, and delete books with links to authors, categories, and publishers.
- **Responsive UI**: Built with Bootstrap for a responsive and modern UI.
- **Backend API**: Exposes RESTful APIs for the front-end to interact with the system.

## Technologies Used

- **Java 17+**: Programming language for backend development.
- **Spring Boot**: Backend framework for creating RESTful APIs and handling business logic.
- **MySQL**: Relational database for storing the system's data.
- **Lombok**: Reduces boilerplate code for data objects and entity classes.
- **Bootstrap**: Frontend CSS framework for responsive and attractive UI design.

## Prerequisites

Before running the application, make sure you have the following installed:

- **Java 17 or higher**: Required for running the backend.
- **MySQL Database**: Ensure MySQL is installed and running on your local machine or server.
- **Maven** or **Gradle**: To build and run the application.

## Getting Started

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/library-management-system.git
cd library-management-system
```

### 2. Set Up the MySQL Database

Create a new database in MySQL for the application:

```sql
CREATE DATABASE library_management;
```

Import the schema from `src/main/resources/schema.sql` or create the required tables based on the models used in the application.

### 3. Configure Application Properties

In the `src/main/resources/application.properties` file, configure the database connection properties as follows:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_management
spring.datasource.username=root
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true
server.port=8080
```

Replace `your-password` with the password for your MySQL root user or set your credentials accordingly.

### 4. Build the Application

You can build the application with Maven or Gradle.

#### Using Maven:

```bash
mvn clean install
```

#### Using Gradle:

```bash
gradle build
```

### 5. Run the Application

To run the application, use the following Maven command:

```bash
mvn spring-boot:run
```

Alternatively, if you're using Gradle:

```bash
gradle bootRun
```

The application will start on `http://localhost:8080`.

## API Endpoints

Here are the available API endpoints for managing the library:

### Authors

- **POST /api/authors**: Add a new author.
- **GET /api/authors**: Get all authors.
- **PUT /api/authors/{id}**: Edit an existing author.
- **DELETE /api/authors/{id}**: Delete an author.

### Categories

- **POST /api/categories**: Add a new category.
- **GET /api/categories**: Get all categories.
- **PUT /api/categories/{id}**: Edit an existing category.
- **DELETE /api/categories/{id}**: Delete a category.

### Publishers

- **POST /api/publishers**: Add a new publisher.
- **GET /api/publishers**: Get all publishers.
- **PUT /api/publishers/{id}**: Edit an existing publisher.
- **DELETE /api/publishers/{id}**: Delete a publisher.

### Books

- **POST /api/books**: Add a new book.
- **GET /api/books**: Get all books.
- **GET /api/books/{id}**: Get a single book by ID.
- **PUT /api/books/{id}**: Edit an existing book.
- **DELETE /api/books/{id}**: Delete a book.

## Frontend

The front-end of the system is built using **Bootstrap** for a responsive design. It communicates with the backend API to provide an intuitive user experience for managing authors, categories, publishers, and books.

## Database Schema

The database schema includes the following entities:

- **Author**: Contains information about authors (e.g., name, biography).
- **Category**: Contains book categories (e.g., fiction, non-fiction, science).
- **Publisher**: Contains publisher details (e.g., name, address).
- **Book**: Contains information about books (e.g., title, author, publisher, category, and publication year).

### Sample Schema (MySQL)

```sql
CREATE TABLE authors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    biography TEXT
);

CREATE TABLE categories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE publishers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255)
);

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author_id INT,
    category_id INT,
    publisher_id INT,
    publication_year INT,
    FOREIGN KEY (author_id) REFERENCES authors(id),
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (publisher_id) REFERENCES publishers(id)
);
```

## Contributing

We welcome contributions to improve the project. To contribute:

1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Commit and push your changes.
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Spring Boot for making backend development simple and fast.
- MySQL for managing the relational database.
- Bootstrap for building responsive UI.
- Lombok for reducing boilerplate code in Java.
