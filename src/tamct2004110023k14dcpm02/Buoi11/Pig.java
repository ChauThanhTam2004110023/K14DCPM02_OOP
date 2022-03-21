package tamct2004110023k14dcpm02.Buoi11;

public class Pig extends Animal implements Pet{

    @Override
    public void makeNosie() {
        System.out.println("Ec Ec");
        
    }

    @Override
    protected void eat() {
        System.out.println("Uc Uc");
        
    }

    @Override
    public void beFriendly() {
        System.out.println("An An");
        
    }

    @Override
    public void play() {
        System.out.println("Ot Ot");
        
    }
    
}
