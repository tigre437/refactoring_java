
class Person{
    private String name;
    private String address;

    public Person(){

    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
}

public class Employee extends Person{
    private int employeeID;
}