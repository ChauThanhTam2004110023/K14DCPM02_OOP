package thuchanh;

public class PTKhoiTaoCafe {
    String tenLoaiCafe;
    double giaTien1kg;
    double khoiLuong;

    public PTKhoiTaoCafe(String ten, double gia, double kl)
    {
        tenLoaiCafe = ten;
        giaTien1kg = gia;
        khoiLuong = kl;
    }

    public double tinhTongTien()
    {
        return this.giaTien1kg * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuong(double kl)
    {
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTien()
    {
        return this.tinhTongTien() > 50000;
    } 

    public double giamGia(double x)
    {
        if(this.tinhTongTien() > 50000)
        {
            return (x/100) * this.tinhTongTien();
        }
        else
        {
            return 0;
        }
    }

    public double sauKhigiamGia(double x)
    {
        return this.tinhTongTien() - this.giamGia(x);
    }
}
