package je3.classes;

/**
 * Java Examples in a Nutshell Chap2 Exercise2
 * @version 1.0 2018-02-04
 * @author Michael
 */

class MailAddress {
    public String name, street, city, state, zip;

    public MailAddress(String name, String street, String city, String state, String zip)
    {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString()
    {
        return name + "\n" + street + "\n" + city + "\n" + state +"\n" + zip;
    }
}

public class Exercise2 {
    public static void main(String[] args)
    {
        MailAddress ma = new MailAddress("Michael", "Zhangba Three Road",
                "Xi'an", "Shan'xi", "300332");
        System.out.println(ma);
    }
}
