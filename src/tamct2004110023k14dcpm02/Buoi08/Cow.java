package tamct2004110023k14dcpm02.Buoi08;

public class Cow extends Animal {
    double giveMilk = 5000;

    public Cow()
    {
        super();
        System.out.println("Constructer.....");
    }

    public Cow(double giveMilk, String name)
    {
        super(name);
        this.giveMilk = giveMilk;
    }
    @Override
    public String toString()
    {
        return "Cow: " +giveMilk+ " " + "Name: " + this.getName() + super.toString();
    }
}
