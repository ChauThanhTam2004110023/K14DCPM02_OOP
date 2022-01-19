package tamct2004110023k14dcpm02.tuan04;

public class Bank {
    String tenNguoiGui;
    String loaiNganHang;
    double sotien;
    double rutTien;
    double laiXuat;

    public Bank(String ten, String loai, double tien,double tienRut, double LaiXuat)
    {
        this.tenNguoiGui = ten;
        this.loaiNganHang = loai;
        this.sotien = tien;
        this.rutTien = tienRut;
        this.laiXuat = LaiXuat;
    }

    public double RutTien()
    {
        return this.sotien - this.rutTien;
    }

    public double tinhLaiXuat()
    {
        return this.sotien * this.laiXuat;
    }

    public double TongLaiXuat()
    {
        return (this.tinhLaiXuat() /365) * 180;
    }
}
