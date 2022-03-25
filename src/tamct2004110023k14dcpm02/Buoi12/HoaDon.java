package tamct2004110023k14dcpm02.Buoi12;

import java.util.Date;

public abstract class HoaDon {
    private String maHD;
    private Date ngayHD;
    private String tenKH;
    private String maPhong;
    private double donGia;
    private static int soLuongHD;

    public static int getSoLuongHD()
    {
        return soLuongHD;
    }

    public HoaDon(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }
    
    private void tangSLHD()
    {
        soLuongHD++;
    }

    public HoaDon()
    {
        this.tangSLHD();
    }

    public abstract double tinhTien();

    @Override
    public String toString() {
        return "Hóa đơn: đơn giá= " +donGia+ " mã HD: " +maHD+ " tên KH: " +tenKH+ " mã phòng: " +maPhong;
    }

    public String getMaHD() {
        return maHD;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public Date getNgayHD() {
        return ngayHD;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
