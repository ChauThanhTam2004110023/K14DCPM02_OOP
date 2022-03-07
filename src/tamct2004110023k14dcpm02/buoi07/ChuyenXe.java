package tamct2004110023k14dcpm02.buoi07;

public class ChuyenXe {
    private String hoVaTenTaiXe;
    private int id;
    private int soXe;
    private int doanhThu;
    public ChuyenXe()
    {

    }

    public ChuyenXe(String hoVaTenLaiXe, int id, int soXe, int doanhThu)
    {
        this.hoVaTenTaiXe = hoVaTenLaiXe;
        this.id = id;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public String getHoVaTenTaiXe()
    {
        return hoVaTenTaiXe;
    }
    public void setHoVaTenTaiXe(String hoVaTenTaiXe)
    {
        this.hoVaTenTaiXe = hoVaTenTaiXe;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public int getSoXe()
    {
        return soXe;
    }
    public void setSoXe(int soXe)
    {
        this.soXe = soXe;
    }

    public int getDoanhThu()
    {
        return doanhThu;
    }
    public void setDoanhThu(int doanhThu)
    {
        this.doanhThu = doanhThu;
    }

    public String toString() {
        String str= "Họ và tên tài xế: "+this.hoVaTenTaiXe + " id: " +this.id + " số xe: " + this.soXe+ " doanh thu: " +this.doanhThu;
        return str; 
    }
}

