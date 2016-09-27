package com.rh.Internship.employeee;

    public class CommissionEmployee extends Employee {

        private long sell;
        private double rate;

        public CommissionEmployee(String empName,String empCode,long commissionSell,double commissionRate){

            super(empName,empCode);
            setSell(CommissionSell);
            setRate(CommissionRate);
        }

        public void setSell(long commissionSell){
            sell=(commissionSell<0)?0:commissionSell;
        }
        public long getSell(){
            return sell;
        }

        public void setRate(double commissionRate){
            rate=(commissionRate>0.0&&commissionRate<1.0)?commissionRate:0.0;
        }
        public double getRate(){
            return rate;
        }

        public double earning(){
            return getSell()*getRate();
        }

        public String toString(){
            return String.format("%s:%s\n%s:T%,.2f;%s:%.2f","commission employee",
                    super.toString(),"sell",getSell(),"rate",getRate());
        }
}
