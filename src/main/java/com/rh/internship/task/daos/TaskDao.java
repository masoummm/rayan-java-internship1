package com.rh.internship.task.daos;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public interface TaskDao {
    List<Task> getTaskByUserId(long userId);
    List<Task> getTaskByPartName(String titlePart);
    void  addTaskForUser(List<Task> task, User user);

}
