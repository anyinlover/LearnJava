package v1ch04.PackageTest;

import v1ch04.PackageTest.com.horstmann.corejava.*;
import static java.lang.System.*;
/**
 * This program demonstrates the use of package.
 * Created by michael on 2/27/16.
 */
public class PackageTest {
    public static void main(String[] args)
    {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
