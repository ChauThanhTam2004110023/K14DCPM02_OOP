package tamct2004110023k14dcpm02.Buoi12;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private float soNgayThue;

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.soNgayThue > 7)
        {
            tien = 7 * this.soNgayThue * this.getDonGia();
        }
        else
        {
            tien = this.soNgayThue * this.getDonGia();
        }
        return tien;
    }
    
    public HoaDonTheoNgay(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia, float soNgayThue) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return "HoaDonTheoNgay: số ngày thuê: " +soNgayThue+ super.toString();
    }
    
}
