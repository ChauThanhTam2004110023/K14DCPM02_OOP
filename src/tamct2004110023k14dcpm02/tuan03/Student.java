package tamct2004110023k14dcpm02.tuan03;

public class Student {
    String name;
    double age;
    String mssv;
    String Class;

    public Student()
    {

    }
    public Student(String ten, double tuoi)
    {
        this.name = ten;
        this.age = tuoi;
    }
    public Student(String ten, double tuoi, String MSSV, String lop)
    {
        this(ten, tuoi);
        this.mssv = MSSV;
        this.Class = lop;
    }

    public void hoc()
    {
        System.out.println("Học Học....");
    }
    public void doc()
    {
        System.out.println("Đọc Đọc");
    }
    public void viet()
    {
        System.out.println("Viết Viết");
    }

}
