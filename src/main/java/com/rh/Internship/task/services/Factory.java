package com.rh.Internship.task.services;

/**
 * Created by star on 10/6/2016.
 */
public class Factory {
    private static UserService service = new UserServiceImpl();

    public static UserService get() {
        return service;
    }
}
