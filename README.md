# E-Commerce Application

This is a simple e-commerce application with a front end and backend built using Java Servlets and JDBC.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java Servlets
- **Database**: MySQL
- **JDBC**: For database connectivity

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Tomcat 9 or higher
- MySQL Database

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/ecommerce-app.git
    cd ecommerce-app
    ```

2. **Setup the database:**
    - Create a MySQL database named `ecommerce`.
    - Run the SQL script `schema.sql` to create the necessary tables.

3. **Configure the database connection:**
    - Update the `db.properties` file with your MySQL database credentials.

4. **Deploy the application:**
    - Build the project using your preferred IDE or Maven.
    - Deploy the WAR file to your Apache Tomcat server.

### Running the Application

1. **Start the Tomcat server:**
    ```bash
    <TOMCAT_HOME>/bin/startup.sh
    ```

2. **Access the application:**
    Open your web browser and go to `http://localhost:8080/Web_cart.

## Project Structure

