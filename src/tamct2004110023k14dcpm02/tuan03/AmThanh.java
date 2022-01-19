package tamct2004110023k14dcpm02.tuan03;

public class AmThanh {
    String hinh;
    String mauSac;
    String xoay;
    String tiengDong;

    public AmThanh(String Hinh, String mau, String Xoay, String TiengDong)
    {
        this.hinh = Hinh;
        this.mauSac = mau;
        this.xoay = Xoay;
        this.tiengDong = TiengDong;
    }

    public void print_Shape()
    {
        System.out.println("Hình: " +hinh);
    }
    public void print_Color()
    {
        System.out.println("Màu: " +mauSac);
    }
    public void print_turn()
    {
        System.out.println("Xoay: " +xoay);
    }
    public void print_sound()
    {
        System.out.println("Tiếng động: " +tiengDong);
    }
}
