import com.rh.Internship.task.models.User;
import com.rh.Internship.task.services.Factory;
import com.rh.Internship.task.services.UserService;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by star on 10/6/2016.
 */
public class GetUserTest {
    @Test
    public void userService_getAllUser_showListOfAllUser() throws Exception {
        UserService userService = Factory.get();
        ArrayList<User> arrayList = (ArrayList<User>) userService.getAllUser();
        assertThat(arrayList.size(), equalTo(4));
        assertThat(arrayList.get(1).getId(), equalTo(2l));
        assertThat(arrayList.get(1).getName(), equalTo("roya"));
        assertThat(arrayList.get(3).getName(), equalTo("mani"));


    }

}
