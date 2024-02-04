# Customer-Management
This project is a simple Customer Management System implemented in Java, utilizing Maven for project management and MySQL as the database. The system allows users to perform basic CRUD (Create, Read, Update, Delete) operations on customer records.
# Project Structure
1.Maven Configuration (pom.xml)
  <!-- Maven Project Configuration -->
  <!-- Java Version and Encoding -->
  <!-- Dependencies -->
2. Main Application (Main.java)
   // Entry point of the Customer Management System
   // Allows users to interact with the system through a console-based menu.
3. Customer Data Access Object (CustomerDao.java)
   // Handles database operations for customer records.
   // - Create
   // - Read (All, By ID)
   // - Update (Name by ID)
   // - Delete (By ID)
4. Customer Information Class (CustomerInfo.java)
   // Represents the structure of a customer record.
   // Contains getters and setters for customer attributes (id, age, name).
5. Database Connection (DBConnection.java)
   // Manages the connection to the MySQL database.
   // Uses JDBC to establish a connection and returns the connection object.
# How to Run
1. Clone the repository: git clone <repository_url>
2. Open the project in your preferred Java IDE.
3. Ensure that Maven is installed and configured.
4. Build the project using Maven.
5. Run the Main class to start the Customer Management System.
# Database Configuration
1. MySQL is used as the database, and the connection details are specified in the DBConnection.java file.
2. Create a MySQL database named customer.
3. Update the connection URL, username, and password in the DBConnection.java file if necessary.
# Dependencies
   MySQL Connector Java 8.0.33,you can change the connector with your desired version.
# Note
   Ensure that you have the required dependencies and a MySQL server running before executing the application.
