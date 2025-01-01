
# User Management Unit Testing Project

This project demonstrates unit testing of a `User` management system using **Hamcrest** assertions and **Test-Driven Development (TDD)** approach. The system allows adding, deleting, and updating users in a list, and it includes the corresponding tests to ensure the functionality works as expected.

## Project Structure

- **User Class**:
  - `User.kt`: Contains the `User` class, which includes the following methods for managing users:
    - `addUser`: Adds a user to the list.
    - `deleteUser`: Deletes a user from the list.
    - `updateUser`: Updates the name of an existing user.
    - `getUsers`: Retrieves the list of users.

- **Tests**:
  - `UserTDD.kt`: Implements unit tests for the `User` class using **Hamcrest assertions**.
  - The tests ensure that the following operations work as expected:
    - Adding a user.
    - Deleting a user.
    - Updating a user.
    - Handling invalid operations (e.g., deleting non-existent users).

## Requirements

- Kotlin 1.5+
- JUnit 5
- Hamcrest

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/yourrepository.git
   ```

2. Open the project in **Android Studio** or any Kotlin-supported IDE.

3. Ensure that you have the required dependencies in your `build.gradle` file for JUnit and Hamcrest.

   Example dependencies:
   ```gradle
   dependencies {
       testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
       testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
       testImplementation 'org.hamcrest:hamcrest:2.2'
   }
   ```

## Usage

### `User` Class
The `User` class is designed to manage a list of users, allowing the following operations:

- **`addUser(user: String)`**: Adds a new user to the list.
- **`deleteUser(user: String)`**: Deletes a user from the list.
- **`updateUser(oldUser: String, newUser: String)`**: Updates a user's name.
- **`getUsers()`**: Retrieves the list of all users.

### Test Class: `UserTDD`
The test class `UserTDD` includes four tests:
1. **test_ajout**: Verifies that a user can be added successfully.
2. **test_suppression**: Verifies that a user can be deleted successfully.
3. **test_suppression_inexistant**: Verifies that trying to delete a non-existent user throws an exception.
4. **test_maj**: Verifies that a user's name can be updated successfully.

The tests use **Hamcrest assertions** to check conditions like whether a user has been added or removed from the list.

## Running Tests

To run the tests, use the following command from the terminal in your project directory:

```bash
./gradlew test
```

Alternatively, you can run the tests directly from your IDE using the built-in test runner.

## Example Usage

### Example: `User` Class
Here’s how to use the `User` class:

```kotlin
val user = User()
user.addUser("Hiba")
println(user.getUsers()) // Output: [Hiba]

user.updateUser("Hiba", "Wahiba")
println(user.getUsers()) // Output: [Wahiba]

user.deleteUser("Wahiba")
println(user.getUsers()) // Output: []
```

### Example: `UserTDD` Tests
Running the tests ensures that all operations are correctly validated, such as:

- **Adding a user**:
  The test checks if "Hiba" is added to the list after calling `addUser`.
  
- **Deleting a user**:
  It verifies that after calling `deleteUser("Hiba")`, "Hiba" is removed from the list.
  
- **Updating a user**:
  The test checks if the name "Hiba" is updated to "Wahiba".
  
- **Handling exceptions**:
  It ensures that trying to delete a non-existent user throws an exception.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
