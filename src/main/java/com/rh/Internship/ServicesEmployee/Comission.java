package com.rh.Internship.ServicesEmployee;

/**
 * Created by DELL on 09/27/2016.
 */
public class Comission implements  Employee {

    public double CalculaterSalary() {
        private double c;
        private double d;

        public Comission( double c1, double d1){
            set_c(c1);
            set_d(d1);
        }

    private double get_c() {
        return c;
    }

    private void set_c(double c1) {
        c = Math.max(valcue, 0);
    }

    private double get_d() {
        return d;
    }

    private void set_d(double d1) {
        d = Math.max(value, 0);
    }

    @Override
    public double  getComission()  {
        return (c * d);
    }
}
