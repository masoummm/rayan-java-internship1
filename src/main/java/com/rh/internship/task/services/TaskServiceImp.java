package com.rh.internship.task.services;

import com.rh.internship.task.daos.DaoFactory;
import com.rh.internship.task.daos.TaskDao;
import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public class TaskServiceImp implements TaskService {

    private TaskDao taskDao = DaoFactory.getTaskDao();

    @Override
    public List<Task> getAllTask(long userId) {
        return null;
    }

    @Override
    public List<Task> findTaskByUser(String titlePart) {
        return taskDao.getTaskByPartName(titlePart);
    }

    @Override
    public void addTasksForUser(List<Task> tasks, User user) {
          taskDao.addTaskForUser(tasks,user);

    }
}
