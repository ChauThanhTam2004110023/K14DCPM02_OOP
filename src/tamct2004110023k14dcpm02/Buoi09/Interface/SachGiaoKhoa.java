package tamct2004110023k14dcpm02.Buoi09.Interface;

public class SachGiaoKhoa extends Sach{
    private String tinhTrang;
    private int number;
    private double thanhTien;

    public SachGiaoKhoa()
    {
        super();
    }
    public SachGiaoKhoa(String tinhTrang, int number)
    {
        super();
        this.tinhTrang = tinhTrang;
        this.number = number;
    }
    public String getTinhTrang()
    {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang)
    {
        this.tinhTrang = tinhTrang;
    }
    public int getNumber()
    {
        return number;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public String tinhTrangSach(int x)
    {
        switch(number)
        {
            case 0: tinhTrang = "Cũ"; break;
            case 1: tinhTrang = "Mới"; break;
            default: break;
        }
        return tinhTrang;
    }

    public void nhapSach()
    {
        super.nhapSach();
        System.out.println("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
        number = sc.nextInt();
    }
    @Override
    public String toString() {
        return super.toString()+ " tình trạng sách: " +this.tinhTrangSach(number);
    }
    public double getThue() {
        return 0;
    }
}
