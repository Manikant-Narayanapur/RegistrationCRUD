RegistrationCRUD

The RegistrationCRUD project is a Java-based application that implements basic CRUD (Create, Read, Update, Delete) operations using a MySQL database. This project serves as a foundational
 example of how to manage registration data, allowing users to register, view, update their information, and delete their entries.

Features
Create: Register a new user with their details.
Read: Retrieve user registration information by ID.
Update: Modify existing user information.
Delete: Remove a user from the registration database.
Validation: Basic validation for input fields.

Technologies Used
Java: Programming language for the backend application.
MySQL: Database management system for storing registration data.
Eclipse IDE**: Development environment used for coding.
JDBC: Java Database Connectivity for interacting with the MySQL database.


Project Setup
Setting Up MySQL Database
1. Open the MySQL command line or MySQL Workbench and log in with your credentials:
   ```bash
   mysql -u root -p
   
2. Create the database and the required table by running the following SQL commands:
CREATE DATABASE test;

USE registration;

CREATE TABLE registration (ID INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(100) NOT NULL, Email VARCHAR(100) NOT NULL UNIQUE,
DateOfBirth DATE NOT NULL, PhoneNumber VARCHAR(15));

Setting Up Java Project in Eclipse
-Open Eclipse and create a new Java project and perform the CRUD operations.

