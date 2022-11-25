package v1ch05.arrayList;

import v1ch05.inheritance.Employee;

import java.util.*;

/**
 * This program demonstrates the ArrayList class.
 * Created by michael on 2/28/16.
 */
public class ArrayListTest {
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1998, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ".salary=" + e.getSalary() + ",hireDay="
                    +e.getHireDay());
    }
}
