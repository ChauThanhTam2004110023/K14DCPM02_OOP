package thuchanh;

public class test {
    public static void main(String[] args) {
        ConNguoi cn = new ConNguoi("Tam", 2002);
        cn.an();
        cn.uong();
        cn.ngu();

        HocSinh hs = new HocSinh("Châu", 2001, "K14", "GDU");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();
    }
}
