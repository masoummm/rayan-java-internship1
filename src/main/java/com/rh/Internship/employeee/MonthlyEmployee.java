package com.rh.Internship.employeee;



    class MonthlyEmployee extends Employee {
        private long monthlySalary ;
        public MonthlyEmployee(String empName,String empCode,long Salary){
            super(empName,empCode);
            setMonthlySalary(Salary);
        }
        public void setMonthlySalary(long salary){
            monthlySalary=salary<0?0:salary;
        }
        public long getMonthlySalary(){
            return monthlySalary;
        }

        public double earning(){
            return getMonthlySalary();
        }

        public String toString(){
            return String.format("Salaried employee:%s\n%s:T%,2f",
                    super.toString(),"monthlySalary",getMonthlySalary());
        }
}
