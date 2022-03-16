package tamct2004110023k14dcpm02.KiemTraGiuaKy;

public class HoaDonTheoGio extends QuanLyKhachSan{
    private int soGioThue;
    private int donGiaTheoGio;
    private int thanhTien;

    public int getSoGioThue()
    {
        return soGioThue;
    }
    public void setSoGioThue()
    {
        this.soGioThue = soGioThue;
    }
    public int getDonGiaTheoGio()
    {
        return donGiaTheoGio;
    }
    public void setDonGiaTheoGio(int donGiaTheoGio)
    {
        this.donGiaTheoGio = donGiaTheoGio;
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
        String str = "Số giờ thuê: " +this.soGioThue+ " đơn giá: " +this.donGiaTheoGio+ " thành tiền: " +this.thanhTien;
        return str;
    }
}
