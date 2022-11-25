package v1ch04.CalendarTest;

import java.time.*;

/**
 * Created by michael on 2/26/16.
 */
public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int mouth = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thus Fri Sat Sun");
        for (int i=1; i<value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == mouth)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();

        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
