package thuchanh.Class.Class01;

public abstract class Hinh {
    
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo)
    {
        this.toaDo = toaDo;
    }
    public ToaDo getToaDo()
    {
        return toaDo;
    }
    public void setToaDon(ToaDo toaDo)
    {
        this.toaDo = toaDo;
    }

    public abstract double tinhDienTich();
}
