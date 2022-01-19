package tamct2004110023k14dcpm02.tuan03;

public class Circle {
    String fileSound;

    public Circle(String fileSound)
    {
        this.fileSound = fileSound;
    }

    void rotate()
    {
        System.out.println("Rotating 360..... ");
    }
    void playSound()
    {
        System.out.println("Play file " +this.fileSound + "music");
    }

    
}
