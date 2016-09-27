package com.rh.Internship.ServicesEmployee;
import  java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by DELL on 09/27/2016.
 */
public class Map {
       HashMap hashsalary()
        {
              HashMap hashMap=new HashMap();
                hashMap.put(arrayList.get(2),Hourly.calculateSalary());
                hashMap.put(arrayList.get(1),Comission.calculateSalary());
                hashMap.put(arrayList.get(0),Salaried.calculateSalary());
                return hashMap;
           }
        public static void main(String[] args) {
               List_Salary list_salary =new List_Salary();
        List_Salary.salary();
               HashMap hashMap= List_Salary.Map();
               Set set=hashMap.entrySet();
                for (Object h:set) {
            System.out.println(h);
                  }

    }
    }


}
