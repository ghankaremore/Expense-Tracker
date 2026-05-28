# Expense-Tracker
Effortlessly manage expenses with this Core Java GUI project. Features include adding, searching, and categorizing expenses using JDBC for database interaction. Ideal for honing Core Java skills. Explore, contribute, and enhance your Java proficiency!

## How to Run This Project

To get this project up and running on your local machine, follow these steps:

### Prerequisites

Before you begin, ensure you have the following installed:

*   **Java Development Kit (JDK)**: Version 8 or higher.
*   **PostgreSQL Database**: This project uses PostgreSQL for database interaction.
*   **Apache NetBeans IDE**: Or any other Java IDE that supports Maven/Gradle projects (though NetBeans is recommended as this appears to be a NetBeans project).

### Database Setup

1.  **Create a PostgreSQL Database**: Create a new database in PostgreSQL. You can name it `expense_tracker` or any other name you prefer.
2.  **Update Database Connection Details**: Open the `DBConnection/DbConnect.java` file and update the `DB_URL`, `USER`, and `PASS` variables with your PostgreSQL database URL, username, and password respectively.

    ```java
    // Example in DBConnection/DbConnect.java
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/expense_tracker";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";
    ```

### Project Setup and Execution

1.  **Open Project in NetBeans**: Launch Apache NetBeans IDE and open the `Expense-Tracker` project.
2.  **Build Project**: Clean and Build the project to resolve any dependencies and compile the source code.
3.  **Run the Application**: Locate the `GUI/expensetrackerhomepage.java` file, right-click on it, and select "Run File" (or similar option to execute the main class). This will launch the Expense Tracker application GUI.
