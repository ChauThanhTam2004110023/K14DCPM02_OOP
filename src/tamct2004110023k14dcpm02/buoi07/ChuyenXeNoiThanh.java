package tamct2004110023k14dcpm02.buoi07;

public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private int soKM;

    public int getSoTuyen()
    {
        return soTuyen;
    }
    public void setSoTuyen(int soTuyen)
    {
        this.soTuyen = soTuyen;
    }

    public int getSoKM()
    {
        return soKM;
    }
    public void setSoKM(int soKM)
    {
        this.soKM = soKM;
    }

    public String toString1() {
        String str = "Số tuyến: "+soTuyen+ " số Km: "+soKM;
        return str;
    }
}
