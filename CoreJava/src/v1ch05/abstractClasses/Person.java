package v1ch05.abstractClasses;

/**
 * Created by michael on 2/28/16.
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
