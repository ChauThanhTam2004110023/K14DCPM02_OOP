package tamct2004110023k14dcpm02.Lab4;

public class Player {
    int number = 0;

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guesing " +number);
    }
}
