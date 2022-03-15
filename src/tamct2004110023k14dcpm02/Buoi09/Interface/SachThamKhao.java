package tamct2004110023k14dcpm02.Buoi09.Interface;

public class SachThamKhao extends Sach{
    private double thue, thanhTien;

    public SachThamKhao()
    {
        super();
    }
    public SachThamKhao(Double thue)
    {
        super();
        this.thue = thue;
    }
    public double getThue()
    {
        return thue;
    }
    public void setThue(double thue)
    {
        this.thue = thue;
    }

    public void nhapSach()
    {
        super.nhapSach();
        System.out.println("Nhập thuế: ");
        thue = sc.nextDouble();
    }
    @Override
    public String toString() {
        return super.toString() + " thuế: " +this.thue;
    }
    public int getNumber() {
        return 0;
    }
}
