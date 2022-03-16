package tamct2004110023k14dcpm02.KiemTraGiuaKy;

public class QuanLyKhachSan {
    private String tenKhachHang;
    private String maPhong;
    private String queQuan;
    private String id;
    private int donGia;

    public QuanLyKhachSan()
    {

    }

    public QuanLyKhachSan(String tenKhachHang, String maPhong, String queQuan, String id, int donGia)
    {
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.queQuan = queQuan;
        this.id = id;
        this.donGia = donGia;
    }
    public String getTenKhachHang()
    {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang)
    {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong()
    {
        return maPhong;
    }
    public void setMaPhong(String maPhong)
    {
        this.maPhong = maPhong;
    }

    public String getQueQuan()
    {
        return queQuan;
    }
    public void setQueQuan(String queQuan)
    {
        this.queQuan = queQuan;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public int getDonGia()
    {
        return donGia;
    }
    public void setDonGia(int donGia)
    {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        String str = "tên khách hàng: " +this.tenKhachHang+ " mã phòng: " +this.maPhong+ " quê quán: " +this.queQuan+ " id: " +this.id+ " đơn giá: " +this.donGia;
        return str;
    }
}
