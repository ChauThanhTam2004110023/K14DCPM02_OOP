package tamct2004110023k14dcpm02.tuan02;

public class Employee {
    //data
    String name;
    int id;
    int age;
    String clas;

    public Employee(String Name, int Id, int Age, String Class)
    {
        name = Name;
        id = Id;
        age = Age;
        clas = Class;
    }

    public void printName()
    {
        System.out.println("Name: " +name);
    }
    public void printId()
    {
        System.out.println("Id: " +id);
    }
    public void printAge()
    {
        System.out.println("Age: " +age);
    }
    public void printClass()
    {
        System.out.println("Class: " +clas);
    }
}
