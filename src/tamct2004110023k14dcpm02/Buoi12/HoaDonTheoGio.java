package tamct2004110023k14dcpm02.Buoi12;

import java.util.Date;

public class HoaDonTheoGio extends HoaDon{
    private float soGioThue;

    @Override
    public double tinhTien() {
        double tien = 0;
        if(this.soGioThue <= 24)
        {
            tien = this.getDonGia() *24;
        }
        else if(this.soGioThue > 24 && this.soGioThue < 30)
        {
            tien = this.getDonGia() * 24;
        }
        else
        {
            System.out.println("HD sẽ đươc tính theo ngay");
        }
        return tien;
    }

    public HoaDonTheoGio(String maHD, Date ngayHD, String tenKH, String maPhong, double donGia, float soGioThue) {
        super(maHD, ngayHD, tenKH, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    @Override
    public String toString() {
        return "HoaDonTheoGio: Số giờ thuê: " + soGioThue+ super.toString();
    }
}
