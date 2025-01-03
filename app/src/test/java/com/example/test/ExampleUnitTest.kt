import com.example.test.User
import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.CoreMatchers.not
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 * Test class for the User class to ensure functionality of user management operations.
 */
class UserTDD {

    @Test
    fun test_ajout() {
        // Test case: Adding a user successfully
        val user = User()
        user.addUser("Hiba")
        assertThat(user.getUsers(), hasItem("Hiba")) // Assert the user list contains "Hiba"
    }

    @Test
    fun test_suppression() {
        // Test case: Deleting an existing user successfully
        val user = User()
        user.addUser("Hiba")
        user.deleteUser("Hiba")
        assertThat(user.getUsers(), not(hasItem("Hiba"))) // Assert the user list does not contain "Hiba"
    }

    @Test
    fun test_suppression_inexistant() {
        // Test case: Attempting to delete a non-existent user should throw an exception
        val user = User()
        assertThrows<IllegalArgumentException> {
            user.deleteUser("NonExistentUser")
        }
    }

    @Test
    fun test_maj() {
        // Test case: Updating an existing user successfully
        val user = User()
        user.addUser("Hiba")
        user.updateUser("Hiba", "Wahiba")
        assertThat(user.getUsers(), not(hasItem("Hiba"))) // Assert the old name is not in the list
        assertThat(user.getUsers(), hasItem("Wahiba"))    // Assert the new name is in the list
    }
}


