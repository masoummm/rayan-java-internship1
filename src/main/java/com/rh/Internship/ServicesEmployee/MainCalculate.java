package com.rh.Internship.ServicesEmployee;

import com.rh.Internship.services.Factory;

/**
 * Created by DELL on 09/27/2016.
 */
public class MainCalculate {
    private  static  Employee employee = Factory.get employee();



    public static void main(String[] args) {
        System.out.format("Hourly is : %d");
        System.out.format("Comission is : %d");
        System.out.format("Salaried is : %d");
    }
}
