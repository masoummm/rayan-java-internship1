package com.rh.internship.task;

import com.rh.internship.task.daos.TaskDaoJpa;
import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.Arrays;
import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public class MainTaskJpa {


    public static void main(String[] args) {

        TaskDaoJpa taskDaoJpa=new TaskDaoJpa();
        User user=new User(4,"peter");
        List<Task> task= Arrays.asList(new Task(6,"h","hh",user));
        taskDaoJpa.addTaskForUser(task,user);





            //     System.out.println(task.getTitle());

      /*EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = entityManagerFactory.createEntityManager();*/

//        em.getTransaction().begin();
//
//        User user = new User("jpa user");
//        em.persist(user);
//
//        em.getTransaction().commit();

 //       User sara = em.find(User.class, 2l);

     //  System.out.println(sara.getName());

     //   sara.getTaskList().forEach(task -> {
       //     System.out.println(task.getTitle());
//            task.setDescription(task.getDescription() + "-");
//            em.merge(task);
    //    });

    //    em.close();

    //    entityManagerFactory.close();*/
    }




}
