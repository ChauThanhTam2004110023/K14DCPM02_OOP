package tamct2004110023k14dcpm02.Buoi06;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;
    
    public int getChieuDai()
    {
        return chieuDai;
    }
    public void setChieuDai(int chieuDai)
    {
        this.chieuDai = chieuDai;
    }
    public int getChieuRong()
    {
        return chieuRong;
    }
    public void setChieuRong(int chieuRong)
    {
        this.chieuRong = chieuRong;
    }
    double tinhDienTich()
    {
        return chieuDai * chieuRong;
    }

    double chuVi()
    {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String toString() {
        String str = "Chiều dài: " + this.chieuDai+ "Chiều rộng: " +this.chieuRong;

        str = "Diện tích: "+ this.tinhDienTich() + "Chu vi: " +this.chuVi();

        return str;
    }
}
