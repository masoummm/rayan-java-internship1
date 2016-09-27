package com.rh.Internship.employeee;


    abstract class Employee {
        private String name;
        private String personnelCode;

        public Employee(String empName,String empCode){
            name=empName;
            personnelCode=empCode;
        }

        public void setName(String empName){
            name=empName;
        }
        public String getName(){
            return name;
        }

        public void setPersonnelCode(String empCode){
            personnelCode=empCode;
        }
        public String getPersonnelCode(){
            return personnelCode;
        }
        public String toString(){
            return String.format("%s %s\npersonnelCode:%s",getName(),getPersonnelCode());
        }

        public  abstract double earning();
}
