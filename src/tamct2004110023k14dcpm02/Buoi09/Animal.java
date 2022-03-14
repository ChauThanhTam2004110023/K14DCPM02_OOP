package tamct2004110023k14dcpm02.Buoi09;

public abstract class Animal {
    private String picture;
    private String food;
    private int hunger;

    protected void makeNoise()
    {
        System.out.println("ồn ồn");
    }
    protected void eat()
    {
        System.out.println("ngoàn ngoàn");
    }
    protected void sleep() 
    {
        System.out.println("Khò Khò");
    }
    protected void roam()
    {
        System.out.println("gừ gừ");
    }
}
