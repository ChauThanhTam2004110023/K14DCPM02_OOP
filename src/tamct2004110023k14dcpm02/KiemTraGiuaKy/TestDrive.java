package tamct2004110023k14dcpm02.KiemTraGiuaKy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        List<HoaDonTheoGio> arDonTheoGios = new ArrayList<>();
        List<HoaDonTheoNgay> arDonTheoNgays = new ArrayList<>();
        int khachHangTheoGio, khachHangTheoNgay;
        double doanhThuHoaDonTheoGio = 0, doanhThuHoaDonTheoNgay = 0;

        Scanner sc = new Scanner(System.in);
        Scanner so = new Scanner(System.in);
        System.out.println("Nhập số khách hàng theo giờ: ");
        khachHangTheoGio = so.nextInt();
        System.out.println("Nhập số khách hàng theo ngày: ");
        khachHangTheoNgay = so.nextInt();

        System.out.println("Khách hàng theo giờ: "); 
        for(int i = 0; i < khachHangTheoGio; i++)
        {
            System.out.println("Nhập thông tin khách hàng theo giờ" +(i+1)+ ":");
            HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();

            System.out.println("Nhập tên khách hàng: ");
            String tenKhachHang = so.nextLine();
            hoaDonTheoGio.setTenKhachHang(tenKhachHang);
            sc.nextLine();

            System.out.println("Nhập mã phòng: ");
            String maPhong = sc.nextLine();
            hoaDonTheoGio.setMaPhong(maPhong);
            
            System.out.println("Nhập quê quán: ");
            String queQuan = sc.nextLine();
            hoaDonTheoGio.setQueQuan(queQuan);

            System.out.println("Nhập id: ");
            String id = sc.nextLine();
            hoaDonTheoGio.setId(id);

            System.out.println("Nhập đơn giá: ");
            int donGia = sc.nextInt();
            hoaDonTheoGio.setDonGia(donGia);

            doanhThuHoaDonTheoGio += hoaDonTheoGio.getDonGia();
            arDonTheoGios.add(hoaDonTheoGio);
        }

        System.out.println("Khách hàng theo ngày");
        for(int i = 0; i < khachHangTheoNgay; i++)
        {
            System.out.println("Nhập khách thư: " +(i+1)+":");
            HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();


            System.out.println("Nhập tên khách hàng: ");
            String tenKhachHang = so.nextLine();
            hoaDonTheoNgay.setTenKhachHang(tenKhachHang);
            sc.nextLine();

            System.out.println("nhập mã phòng: ");
            String maPhong = sc.nextLine();
            hoaDonTheoNgay.setMaPhong(maPhong);;
            
            System.out.println("nhập quê quán: ");
            String queQuan = sc.nextLine();
            hoaDonTheoNgay.setQueQuan(queQuan);

            System.out.println("Nhập id: ");
            String id = sc.nextLine();
            hoaDonTheoNgay.setId(id);

            System.out.println("Nhập đơn giá: ");
            int donGia = sc.nextInt();
            hoaDonTheoNgay.setDonGia(donGia);

            doanhThuHoaDonTheoNgay += hoaDonTheoNgay.getDonGia();
            arDonTheoNgays.add(hoaDonTheoNgay);
        }
        
        System.out.println("thông tin khách hàng theo gio");
        for(int i = 0; i < arDonTheoGios.size(); i++)
        {
            System.out.println(arDonTheoGios.get(i).toString());
            System.out.println(arDonTheoGios.get(i).toString());
        }

        System.out.println("thông tin khách hàng theo ngay");
        for(int i = 0; i < arDonTheoNgays.size(); i++)
        {
            System.out.println(arDonTheoNgays.get(i).toString());
            System.out.println(arDonTheoNgays.get(i).toString());
        }
        System.out.println("Doang thu, đơn giá");
        System.out.println("Doang thu theo giờ: " +doanhThuHoaDonTheoGio);
        System.out.println("Daonh thu theo ngày: " +doanhThuHoaDonTheoNgay);
    }
}
