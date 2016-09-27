package com.rh.intership.Employee;
import com.rh.Internship.ServicesEmployee.List_Salary;
import org.junit.Test;

/**
 * Created by DELL on 09/27/2016.
 */
public class Map_test {
    @Test
    public void getMap_getForhashmap_retunvalue()
    {
        List_Salary list_salary= new getList_Salary();
        assertThat(List_Salary.getlist_salary(), equalTo(300L) );
    }




}
