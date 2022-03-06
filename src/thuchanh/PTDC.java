package thuchanh;

abstract class PTDC {
    protected String tenLoaiPhuongTien;

    public PTDC(String tenLoaiPhuongTien)
    {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String getTLPT()
    {
        return tenLoaiPhuongTien;
    }
    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien)
    {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    
}
