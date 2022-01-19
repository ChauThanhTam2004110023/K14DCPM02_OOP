package tamct2004110023k14dcpm02.Buoi04;

public class TestAmoeba {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba("Music Spring Amoeba.hif", 5.5, 2.6);
        amoeba.click();
        amoeba.playSound();
        amoeba.rotate();
    }
}
