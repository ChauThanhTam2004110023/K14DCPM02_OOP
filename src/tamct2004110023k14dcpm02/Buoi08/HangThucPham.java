package tamct2004110023k14dcpm02.Buoi08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySx;
    private Date ngayHetHan;
    public HangThucPham(String maHang)
    {
        this.setMaHang(maHang);
    }
    
    public String getMaHang() 
    {
        return maHang;
    }
    public void setMaHang(String maHang) 
    {
        if(maHang == null)
        {
            this.maHang = maHang;
        }
        else
        {
            System.out.println("Mã hàng không được rỗng");
        }
    }

    public String getTenHang() 
    {
        return tenHang;
    }
    public void setTenHang(String tenHang) 
    {
        this.tenHang = tenHang;
    }

    public double getDonGia() 
    {
        return donGia;
    }
    public void setDonGia(double donGia) 
    {
        this.donGia = donGia;
    }

    public Date getNgaySx() 
    {
        return ngaySx;
    }
    public void setNgaySx(Date ngaySx) 
    {
        this.ngaySx = ngaySx;
    }

    public Date getNgayHetHan(Date ngayHetHan) 
    {
        if(ngayHetHan.after(ngaySx))
        {
            return this.ngayHetHan = ngayHetHan;
        }
        else
        {
            System.out.println("Ngày hết hạn phải sao ngày sản xuất" );
        }
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) 
    {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() 
    {
        //8-9-2022 - dd/mm/yyy
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHetHan=" + ngayVietNam.format(ngaySx) + ", ngaySx="
                + ngaySx + ", tenHang=" + tenHang + "]";
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySx, Date ngayHetHan) 
    {
        this.setMaHang(maHang);
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySx = ngaySx;
        this.setNgayHetHan(ngayHetHan);
    }
   
    public boolean kiemTraHang()
    {
        boolean isHetHan = false;
        Date ngayHienTai = new Date();
        if(ngayHetHan.before(ngayHienTai))
        {
            isHetHan = true;
        }
        return isHetHan;
    }
}
