package tamct2004110023k14dcpm02.Buoi08;

public class Animal {
    private String name;

    public Animal()
    {
        name = "Tèo Con";
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Animal(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return("Animal: " +name);
    }
}
