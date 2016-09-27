package com.rh.Internship.employeee;


    public class HourlyEmployee extends Employee {

        private long wage;
        private int hour;

        public HourlyEmployee(String empName,String empCode,long hourlyWage,int hoursWorked){
            super(empName,empCode);
            setWage(hourlyWage);
            setHour(hoursWorked);
        }

        public void setWage(long hourlyWage){
            wage=(hourlyWage<0)?0:hourlyWage;
        }

        public long getWage(){
            return wage;
        }

        public void setHour(int hoursWorked){
            hour=(hoursWorked<0)?0:hoursWorked;
        }

        public int getHour(){
            return hour;
        }

        public double earning(){
            return getWage()*getHour();
        }

        public String toString(){
            return String.format("hourly employee:%s\n%s:T%,.2f;%s:%,.2f",super.toString(),
                    "hourly wage",getWage(),"hours worked",getHour());
        }
}
