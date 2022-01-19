package tamct2004110023k14dcpm02.tuan03;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("Music Spring Circle.aif");
        circle.rotate();
        circle.playSound();

        circle.fileSound = "Music Spring Circle.aif";
        circle.rotate();
        circle.playSound();
    }
}
