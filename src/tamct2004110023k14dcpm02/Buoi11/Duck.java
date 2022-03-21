package tamct2004110023k14dcpm02.Buoi11;

/// da ke thua thong so
public class Duck {
    private int size;
    private String name;
    private static int dem = 0;

    public Duck()
    {
        dem++;
    }

    public static int getDem()
    {
        return dem;
    }

    private void Duck()
    {
        dem++;
    }

    static
    {
        System.out.println("He he...");
    }
    public Duck(int size)
    {
        this.size = size;
        dem++;
    }

    public int getSize() 
    {
        return size;
    }
    public void setSize(int size) 
    {
        this.size = size;
    }

    /// khi thiet ke class ngoai viec chua thanh vien doi tuong thi con co thanh vien class/static
    /// khong can tao bat ky object van co the su dung duoc thanh vien class bang cu phap <ten>.class Thanh vien
    /// thanh vien class/static se thuc thi (chay) truoc khi bat ky object 
}
