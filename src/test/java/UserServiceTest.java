import com.rh.internship.task.daos.DaoFactory;
import com.rh.internship.task.daos.TaskDao;
import com.rh.internship.task.daos.UserDao;
import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;
import com.rh.internship.task.services.ServiceFactory;
import com.rh.internship.task.services.TaskService;
import com.rh.internship.task.services.UserService;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Saeed Zarinfam
 */

public class UserServiceTest {

    private static UserService userService = ServiceFactory.getUserService();
    private static UserDao userDao = DaoFactory.getUserDao();
    private static TaskService taskService = ServiceFactory.getTaskService();
    private static TaskDao taskDao = DaoFactory.getTaskDao();

    @Test
    public void getAllUsers_getAllUsersFromDao_returnAllUsers() {
        List<User> allUser = userService.getAllUser();

        assertThat(allUser.size(), equalTo(4));

        assertThat(allUser.stream().map(user -> user.getId()).collect(Collectors.toList())
                , containsInAnyOrder(1l, 2l, 3l, 4l));

        assertThat(allUser.stream().map(user -> user.getName()).collect(Collectors.toList())
                , containsInAnyOrder("alice", "jack", "kevin", "peter"));

    }

    @Test
    public void createUser_createUserUsingService_createdUserInDB() {
        User createdUser = new User(5, "test-create");
        userService.createUser(createdUser);

        List<User> allUser = userDao.selectAllUser();
        assertThat(allUser.size(), equalTo(5));

        assertThat(allUser.stream().map(user -> user.getName()).collect(Collectors.toList())
                , containsInAnyOrder("alice", "jack", "peter", "kevin", "test-create"));

        //cleanup db
        userDao.deleteUser(createdUser.getId());

    }

    @Test
    public void getTask_getTaskLiseInput_returnAllTaskLike() {
        List<Task> allTask = taskService.findTaskByUser("shop");
        assertThat(allTask.stream().map(task -> task.getDescription()).collect(Collectors.toList())
                , containsInAnyOrder("task shop","task shopping"));

    }





}
