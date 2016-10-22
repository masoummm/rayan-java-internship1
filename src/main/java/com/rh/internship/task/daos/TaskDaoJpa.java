package com.rh.internship.task.daos;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by star on 10/20/2016.
 */
public class TaskDaoJpa extends GeneralDaoJpa implements TaskDao {
    @Override
    public List<Task> getTaskByUserId(long userId) {
        return null;
    }

    @Override
    public List<Task> getTaskByPartName(String titlePart) {
//select t from Task t where t.title like ?1
//   select u,t from User u,Task t join u.tasklist where t.title like ?1

        return runJpaCode(em -> em.createQuery("select t from Task t where t.title like ?1")
                        .setParameter(1, titlePart).getResultList()
                , false).orElseGet(ArrayList::new);
    }

    @Override
    public void addTaskForUser(List<Task> task, User user) {

        runJpaCode(em -> {

            em.persist(em.find(Task.class, user));

            return task;
        }, true);
    }
}
