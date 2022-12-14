package v1ch06.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by michael on 3/5/16.
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        hireday = new Date();
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee) super.clone();

        cloned.hireday = (Date) hireday.clone();

        return cloned;
    }

    /**
     * Set the hire day to a given date.
     * @param year the year of the hire day
     * @param month the month of the hire day
     * @param day the day of the hire day
     */
    public void setHireDay(int year, int month, int day)
    {
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireday.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString()
    {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireday + "]";
    }
}
