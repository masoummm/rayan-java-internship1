package com.rh.Internship.ServicesEmployee;

/**
 * Created by DELL on 09/27/2016.
 */
public class Hourly implements  Employee  {
    private  double a;
    private  double b;
public  Hourly (double a1,double b1){
    set_a(a1);
    set_b(b1);
}
    private  double get_b()
    {return b;}

    private void set_b(double b1) {
      b = Math.max(value, 0);
    }
    private  double get_a()
    {return a;}
    private  void set_a (double value) {
        a = Math.max(value, 0);
    }

    @Override
    public double getHorly() {
        return (a*b);


    }
}

