package tamct2004110023k14dcpm02.buoi07;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public String getNoiDen()
    {
        return noiDen;
    }
    public void setNoiDen(String noiDen)
    {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc()
    {
        return soNgayDiDuoc;
    }
    public void setSoNgayDiDuoc(int soNgayDiDuoc)
    {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String toString1() {
        String str = "Nơi đến: " +this.noiDen + " số ngày đi được: " +this.soNgayDiDuoc;
        return str;
    }
}
