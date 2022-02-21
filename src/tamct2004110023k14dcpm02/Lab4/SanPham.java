package tamct2004110023k14dcpm02.Lab4;

public class SanPham {
    private String tenSanPham;
    private int donGia;
    private double giamGia;
    private double thueNhapKhau;

    public SanPham(String tenSanPham, int donGia, double giamGia, double thueNhapKhau)
    {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getTenSanPham()
    {
        return tenSanPham;
    }
    public void setTenSanPham(String tenSanPham)
    {
        this.tenSanPham = tenSanPham;
    }

    public int getdonGia()
    {
        return donGia;
    }
    public void setDonGia(int donGia)
    {
        this.donGia = donGia;
    }

    public double getGiamGia()
    {
        return giamGia;
    }
    public void setGiamGia()
    {
        giamGia = donGia - giamGia;
    }

    public double getThueNhapKhau()
    {
        return thueNhapKhau;
    }
    public void setThueNhapKhau(double thueNhapKhau)
    {
        thueNhapKhau = 10 * donGia / 100;
    }
    
}

