/**
 * 
 */

/**
 * @author cjohns25
 *
 */
public class EmployeeTester
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
       
        Marketer newEmployee = new Marketer();
        
        newEmployee.setBaseSalary(25000);
        System.out.println("New Marketers salary is " + newEmployee.getSalary());
        newEmployee.advertise();

    }

}
