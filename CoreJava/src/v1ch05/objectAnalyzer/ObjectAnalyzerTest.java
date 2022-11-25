package v1ch05.objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 * Created by michael on 3/3/16.
 * Need to learn again 2/4/2018.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args)
    {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
