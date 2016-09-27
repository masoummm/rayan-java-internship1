import employee.persons.Person;
import employee.services.Factory;
import employee.services.SalaryService;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by star on 9/27/2016.
 */
public class SalaryServicePersonTest {
    Person person=new Person();
    @Test
    public void getSalaryAmounFromFactory_getAmountForSalarid_retunFixedAmount()
    {
        SalaryService salaryService= Factory.getSalaried();
        assertThat(salaryService.calculateSalary(person), equalTo(10000000L) );
    }
    @Test
    public void getSalaryAmountFromFactory_getAmountForHourly_returnHourmultiplewage()
    {
        SalaryService salaryService=Factory.getHourly();
        assertThat(salaryService.calculateSalary(person),equalTo(60000000L));
    }
    @Test
    public void getSalaryServiceAmountFromFactory_getAmountForComission_returnSalemultipleRate()
    {
        SalaryService salaryService=Factory.getComission();
        assertThat(salaryService.calculateSalary(person),equalTo(2000000L));
    }
}
