package com.rh.intership.Employee;
import com.rh.Internship.ServicesEmployee.Employee;
import com.rh.Internship.services.Factory;
import com.rh.Internship.services.MessageService;
import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
/**
 * Created by DELL on 09/27/2016.
 */
public class ListSalary {
       @Test
        public void getSalaryFromFactory_getForSalarid_retunvalue()
       {
                Employee employee= Factory.getSalaried();
               assertThat(employee.getemployee(), equalTo(20000000L) );
           }
        @Test
        public void getSalarytFromFactory_gettForHourly_returnvalue()
       {
               Employee employee=Factory.getHourly();
        assertThat(employee.getemployee(),equalTo(8000000L));
    }
       @Test
       public void getSalaryFromFactory_getForComission_returnvalue()
        {
               Employee employee=Factory.getComission();
                assertThat(employee.getemployee(),equalTo(6000000L));

    }
