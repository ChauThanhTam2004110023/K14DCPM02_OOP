package tamct2004110023k14dcpm02.Buoi04;

public class Testbank {
    public static void main(String[] args) {
       Bank bank = new Bank("Tâm", "BIDV", 50, 20, 700);
       System.out.println("Rút tiền: " +bank.RutTien());
       System.out.println("Lãi xuất: " +bank.tinhLaiXuat());
       System.out.println("Tổng lai xuất: " +bank.TongLaiXuat());
    }
}
