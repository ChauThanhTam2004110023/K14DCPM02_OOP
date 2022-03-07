package tamct2004110023k14dcpm02.Buoi06;

public class Cat extends Feline{
    @Override
    protected void makeNoise()
    {
        System.out.println("Meo Meo");
    }
    @Override
    protected void eat()
    {
        System.out.println("an com");
    }
    
    public void chaseCats()
    {
        System.out.println("Duoi cho");
    }
}
