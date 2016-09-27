package employee.services;

import employee.persons.Person;
import employee.persons.PersonComission;
import employee.persons.PersonHourly;
import employee.persons.PersonSalaried;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by star on 9/27/2016.
 */
public class SalaryServiceList {
    Person person=new Person();
    ArrayList arrayList=new ArrayList();
    PersonSalaried personSalaried=new PersonSalaried();
    PersonComission personComission=new PersonComission();
    PersonHourly personHourly=new PersonHourly();
    public void salary()
    {

        arrayList.add("sf");
        arrayList.add("cm");
        arrayList.add("hr");

    }
    HashMap hashsalary()
    {
       HashMap hashMap=new HashMap();
        hashMap.put(arrayList.get(2),personHourly.calculateSalary(person));
        hashMap.put(arrayList.get(1),personComission.calculateSalary(person));
        hashMap.put(arrayList.get(0),personSalaried.calculateSalary(person));
        return hashMap;
    }
    public static void main(String[] args) {
        SalaryServiceList SalaryServiceList =new SalaryServiceList();
        SalaryServiceList.salary();
        HashMap hashMap= SalaryServiceList.hashsalary();
        Set set=hashMap.entrySet();
        for (Object o:set) {
            System.out.println(o);
        }

    }
}
