package com.rh.Internship.ServicesEmployee;

/**
 * Created by DELL on 09/27/2016.
 */
public class Factory1 {
    public static Employee double employee() {return  new Comission();}
   public static Employee double employee() {return  new Hourly();}
    public static Employee double employee() {return  new Salaried();}


}
