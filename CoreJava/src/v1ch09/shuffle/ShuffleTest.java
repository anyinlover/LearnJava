package v1ch09.shuffle;

import java.util.*;
/**
 * ShuffleTest
 * @version 1.0 2018-02-06
 * @author Michael
 */

public class ShuffleTest {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);

    }

}
