package tamct2004110023k14dcpm02.Buoi06;

public class SinhVien {
    private int mssv;
    private String hoVaTen;
    private int diemLT;
    private int diemTH;

    public SinhVien(String hoVaTen, int mssv, int diemLT, int diemTH)
    {
        this.hoVaTen = hoVaTen;
        this.mssv = mssv;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    SinhVien ()
    {

    }

    public int getmssv()
    {
        return mssv;
    }
    public void setmssv(int mssv)
    {
        this.mssv = mssv;
    }

    public String gethoVaTen()
    {
        return hoVaTen;
    }
    public void sethoVaTen(String hoVaTen)
    {
        this.hoVaTen = hoVaTen;
    }

    public int getdiemLT()
    {
        return diemLT;
    }
    public void setdiemLT(int diemLT)
    {
        this.diemLT = diemLT;
    }

    public int getdiemTH()
    {
        return diemTH;
    }
    public void setdiemTH(int diemTH)
    {
        this.diemTH = diemTH;
    }

    double diemTrungBinh()
    {
        return (this.diemLT + this.diemTH) / 2;
    }

    @Override
    public String toString() {
        String str = "MSSV: "+ this.mssv + " họ và tên: "+ this.hoVaTen 
        + " điểmLT " + this.diemLT + " điểmTH: " +this.diemTH + " Điểm trung bình: " +this.diemTrungBinh();
        return str;
    }
}
