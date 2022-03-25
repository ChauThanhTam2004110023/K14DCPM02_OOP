package tamct2004110023k14dcpm02.Buoi12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DanhSachHoaDOn {
    private List<HoaDon> danhsach = new ArrayList<>();
    private int soLuongHDTheoGio;
    private int soLuongHDTheoNgay;

    public int getSoLuongHDTheoGio() {
        return soLuongHDTheoGio;
    }
    public int getSoLuongHDTheoNgay() {
        return soLuongHDTheoNgay;
    }

    public void them(HoaDon hoaDon)
    {
        this.danhsach.add(hoaDon);
    }

    public void inDangSach()
    {
        for(HoaDon hoaDon: danhsach)
        {
            System.out.println(hoaDon);
        }
    }

    public void tinhTongTungLoai()
    {
        for(HoaDon hoaDon: danhsach)
        {
            if(hoaDon instanceof HoaDonTheoGio)
            {
                this.soLuongHDTheoGio++;
            }
            else
            {
                this.soLuongHDTheoNgay++;
            }
        }
    }

    public double tinhTienHD()
    {
        double tien = 0;
        int dem = 0;
        Calendar calendar = Calendar.getInstance();
        for(HoaDon hoaDon: danhsach)
        {
            Date ngayHoaDon = hoaDon.getNgayHD();
            calendar.setTime(ngayHoaDon);
            int month = calendar.get(calendar.MONTH);
            int year = calendar.get(calendar.YEAR);
            if(month == 2 && year == 2022)
            {
                tien += hoaDon.tinhTien();
                dem++;
            }
        }
        return tien/dem;
    }

    public void xoaHoaDon(HoaDon hoaDon)
    {
        this.danhsach.remove(hoaDon);
    }
    
    public int timViTriHoaDon(HoaDon hoaDon)
    {
        int viTri = -1;
        viTri = this.danhsach.indexOf(hoaDon);
        return viTri;
    }

    public void suaHoaDon(int viTri, HoaDon hoaDon)
    {
        this.danhsach.set(viTri, hoaDon);
    }

    public HoaDon timHoaDonTheoMa(String maHD)
    {
        HoaDon hoaDon = null;
        for(HoaDon hd: danhsach)
        {
            if(hd.getNgayHD().toString().equalsIgnoreCase(maHD))
            {
                hoaDon = hd;
            }
        }
        return hoaDon;
    }

    public HoaDonTheoNgay timHoaDonNgayTheoMa(String maHD)
    {
        HoaDonTheoNgay hoaDonTheoNgay = null;
        for(HoaDon hd: danhsach)
        {
            if(hd.getNgayHD().toString().equalsIgnoreCase(maHD) && hd instanceof HoaDonTheoNgay)
            {
                hoaDonTheoNgay = (HoaDonTheoNgay) hd;
            }
        }
        return hoaDonTheoNgay;
    }
}
