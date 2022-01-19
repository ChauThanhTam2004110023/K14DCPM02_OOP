package tamct2004110023k14dcpm02.Buoi04;

public class Amoeba {
    String fileSound;
    double xPoint;
    double yPoint;

    public Amoeba(String fileSound)
    {
        this.fileSound = fileSound;
    }

    public Amoeba(String fileSound, double xPoint, double yPoint)
    {
        this(fileSound);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    void click()
    {
        System.out.println("click go up Amoeba");
    }
    void playSound()
    {
        System.out.println("Play file: " +this.fileSound+ "music");
    }
    void rotate()
    {
        System.out.println("Rotating 360 .... at xPoint" +this.xPoint+ "yPoint" +this.yPoint);
    }
}
