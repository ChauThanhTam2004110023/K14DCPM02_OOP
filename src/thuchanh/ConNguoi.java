package thuchanh;

public class ConNguoi {
    String hoVaTen;
    int namSinh;

    public ConNguoi(String hoVaTen, int namSinh)
    {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
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

    public void an()
    {
        System.out.println("Măm Măm");
    }
    public void uong()
    {
        System.out.println("Ực Ực");
    }
    public void ngu()
    {
        System.out.println("khò Khò");
    }

}
