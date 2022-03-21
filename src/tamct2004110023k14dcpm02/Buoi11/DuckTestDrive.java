package tamct2004110023k14dcpm02.Buoi11;

public class DuckTestDrive {
    public static void main(String[] args) {
        System.out.println("So vit: " +Duck.getDem());
        Duck duck = new Duck(); //dem = 1
        Duck duck0 = new Duck(); //dem = 2
        System.out.println("So vit: " +Duck.getDem());
    }
}
