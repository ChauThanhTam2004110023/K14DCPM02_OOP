package tamct2004110023k14dcpm02.Buoi12;

import java.util.Date;
import java.util.Scanner;

public class ConsleInput {
    Scanner sc = new Scanner(System.in);
    public Object input;
    
    public HoaDon inPutHoaDon()
    {
        HoaDon hoaDon = null;

        System.out.println("Nhập mã HD: ");
        String maHD = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        double donGia = sc.nextDouble();
        System.out.println("Nhap ma phong: ");
        String maPhong = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        String tenKhachHang = sc.nextLine();

        //Nhập của con
        // 2 loại theo ngày 0, theo giờ 1
        System.out.println("Bạn nhập loại nào? Ngày: 1; Giờ: 0");
        int loai = sc.nextInt();
        sc.nextLine();
        if(loai == 1)
        {
            System.out.println("Số ngày thuê");
            float soNgayThue = sc.nextFloat();
            sc.nextLine();
            
            hoaDon = new HoaDonTheoNgay(maHD, new Date(), "tênKH", "Ma Phong", donGia, soNgayThue);
        }
        else
        {
            System.out.println("Số giờ thuê: ");
            float soGioThue = sc.nextFloat();
            sc.nextLine();
            hoaDon = new HoaDonTheoGio(maHD, new Date(), "TênKH", "Ma Phong", donGia, soGioThue);
        }
        return hoaDon;
    }
}
