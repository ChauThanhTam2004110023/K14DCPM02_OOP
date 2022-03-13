package thuchanh.Class.Class01;

public class HinhChuNhat extends Hinh{
    private double chieuDai ;
    private double chieuRong; 

    public HinhChuNhat(ToaDo toaDo, double chieuDai, double chieuRong)
    {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai* this.chieuRong;
    }
}
