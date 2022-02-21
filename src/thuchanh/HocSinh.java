package thuchanh;

public class HocSinh extends ConNguoi{
    String tenLop;
    String tenTruong;
    
    public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong)
    {
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }
    public String getHoVaTen()
    {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen)
    {
        this.hoVaTen = hoVaTen;
    }

    public int namSinh()
    {
        return namSinh;
    }
    public void setNamSinh(int namSinh)
    {
        this.namSinh = namSinh;
    }

    public String getTenLop()
    {
        return tenLop;
    }
    public void setTenLop(String tenLop)
    {
        this.tenLop = tenLop;
    }

    public String getTenTruong()
    {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong)
    {
        this.tenTruong = tenTruong; 
    }

    public void lamBaiTap()
    {
        System.out.println("Làm Bài Tập Về Nhà");
    }
}
