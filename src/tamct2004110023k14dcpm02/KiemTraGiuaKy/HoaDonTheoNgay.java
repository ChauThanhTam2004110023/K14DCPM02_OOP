package tamct2004110023k14dcpm02.KiemTraGiuaKy;

public class HoaDonTheoNgay extends QuanLyKhachSan{
    private int soNgayThue;
    private int donGiaTheoNgay;
    private int thanhTien;

    public int getSoNgayThue()
    {
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue)
    {
        this.soNgayThue = soNgayThue;
    }
    public int getDonGiaTheoNgay()
    {
        return donGiaTheoNgay;
    }
    public void setDonGiaTheoNgay()
    {
        this.donGiaTheoNgay = donGiaTheoNgay;
    }
    public int getThanhTien()
    {
        return thanhTien;
    }
    public void setThanhTien(int thanhTien)
    {
        this.thanhTien = thanhTien;
    }
    @Override
    public String toString() {
        String str = "số ngày thuê: " +this.soNgayThue+ " đơn giá theo ngày: " +this.donGiaTheoNgay+ " Thành tiền: " +this.thanhTien;
        return str;
    }
}
