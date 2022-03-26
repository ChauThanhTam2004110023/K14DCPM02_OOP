package tamct2004110023k14dcpm02.CuoiKy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangThucPham extends KhoHang{
    private Date ngaySX;
    private Date NgayHetHan;

    public HangThucPham()
    {
        
    }
    
    public HangThucPham(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, Date ngaySX, Date ngayHetHan) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.ngaySX = ngaySX;
        NgayHetHan = ngayHetHan;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(NgayHetHan);   
        return " Ngày sản xuất: " +str1+ " ngày hết hạn: " +str2;
    }

    public void setNSX(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngaySX = calendar.getTime();
    }
    public void setHSD(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.NgayHetHan = calendar.getTime();
    }

}
