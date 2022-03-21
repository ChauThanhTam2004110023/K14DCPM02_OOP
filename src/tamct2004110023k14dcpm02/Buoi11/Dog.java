package tamct2004110023k14dcpm02.Buoi11;

public class Dog extends Animal implements Pet{

    @Override
    public void beFriendly() {
        System.out.println("Ực Ực");
        
    }

    @Override
    public void play() {
        System.out.println("Go to play");        
    }

    @Override
    public void makeNosie() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void eat() {
        System.out.println("Ăn Ăn");
        
    }
    
}
