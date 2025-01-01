package com.example.test

/**
 * A class to manage a list of users with add, delete, and update operations.
 */
class User {
    // Internal list to store user names
    private val users = mutableListOf<String>()

    /**
     * Adds a new user to the list.
     * @param user The name of the user to add.
     * @throws IllegalArgumentException If the user name is blank.
     */
    fun addUser(user: String) {
        if (user.isBlank()) {
            throw IllegalArgumentException("User name cannot be blank")
        }
        users.add(user)
    }

    /**
     * Deletes a user from the list.
     * @param user The name of the user to delete.
     * @throws IllegalArgumentException If the user name is blank or not found in the list.
     */
    fun deleteUser(user: String) {
        if (user.isBlank()) {
            throw IllegalArgumentException("User name cannot be blank")
        }
        if (!users.contains(user)) {
            throw IllegalArgumentException("User '$user' not found")
        }
        users.remove(user)
    }

    /**
     * Updates the name of an existing user.
     * @param oldUser The current name of the user.
     * @param newUser The new name to assign to the user.
     * @throws IllegalArgumentException If either name is blank or the old name is not found.
     */
    fun updateUser(oldUser: String, newUser: String) {
        if (oldUser.isBlank() || newUser.isBlank()) {
            throw IllegalArgumentException("User names cannot be blank")
        }
        if (!users.contains(oldUser)) {
            throw IllegalArgumentException("User '$oldUser' not found")
        }
        val index = users.indexOf(oldUser)
        users[index] = newUser
    }

    /**
     * Retrieves the list of users.
     * @return A list of user names.
     */
    fun getUsers(): List<String> = users
}
