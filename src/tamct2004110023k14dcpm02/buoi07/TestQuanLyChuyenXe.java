package tamct2004110023k14dcpm02.buoi07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuanLyChuyenXe {
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
         
        Scanner so = new Scanner(System.in);
        Scanner kiTu = new Scanner(System.in);
        System.out.print("Nhập số chuyến xe nội thành: ");
        soChuyenNoiThanh = so.nextInt();
        System.out.print("Nhập số chuyến xe ngoại thành: ");
        soChuyenNgoaiThanh = so.nextInt();
         
        System.out.println("Nhập thông tin chuyến xe nội thành:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();

            System.out.println("Nhập doanh thu: ");
            int doanhThu=so.nextInt();
            chuyenXeNoiThanh.setDoanhThu(doanhThu);

            System.out.println("Nhập họ và tên: ");
            String hoVaTenTaiXe=kiTu.nextLine();
            chuyenXeNoiThanh.setHoVaTenTaiXe(hoVaTenTaiXe);

            System.out.println("Nhập mã số chuyến xe: ");
            int id=so.nextInt();
            chuyenXeNoiThanh.setId(id);

            System.out.println("Nhập số KM: ");
            int soKM=so.nextInt();
            chuyenXeNoiThanh.setSoKM(soKM);

            System.out.println("Nhập số tuyến: ");
            int soTuyen=so.nextInt();
            chuyenXeNoiThanh.setSoTuyen(soTuyen);

            System.out.println("Nhập số xe: ");
            int soXe=so.nextInt();
            chuyenXeNoiThanh.setSoXe(soXe);

            doanhThuXeNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        }
         
        System.out.println("Nhập thông tin chuyến xe ngoại thành:");
        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();

            System.out.println("Nhập doanh thu: ");
            int doanhThu=so.nextInt();
            chuyenXeNgoaiThanh.setDoanhThu(doanhThu);

            System.out.println("Nhập họ và tên: ");
            String hoVaTenTaiXe=kiTu.nextLine();
            chuyenXeNgoaiThanh.setHoVaTenTaiXe(hoVaTenTaiXe);

            System.out.println("Nhập mã số chuyến xe: ");
            int id=so.nextInt();
            chuyenXeNgoaiThanh.setId(id);

            System.out.println("Nhập nơi đến: ");
            String noiDen=kiTu.nextLine();
            chuyenXeNgoaiThanh.setNoiDen(noiDen);

            System.out.println("Nhập số ngày đi được: ");
            int soNgayDiDuoc=so.nextInt();
            chuyenXeNgoaiThanh.setSoNgayDiDuoc(soNgayDiDuoc);

            System.out.println("Nhập số xe: ");
            int soXe=so.nextInt();
            chuyenXeNgoaiThanh.setSoXe(soXe);

            doanhThuXeNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
         
        System.out.println("-----Thông tin chuyến xe nội thành-----");
        for (int i = 0; i < arrChuyenXeNoiThanh.size(); i++) {
            System.out.println(arrChuyenXeNoiThanh.get(i).toString());
            System.out.println(arrChuyenXeNoiThanh.get(i).toString1());

        }
         
        System.out.println("-----Thông tin chuyến xe ngoại thành-----");
        for (int i = 0; i < arrChuyenXeNgoaiThanh.size(); i++) {
            System.out.println(arrChuyenXeNgoaiThanh.get(i).toString());
            System.out.println(arrChuyenXeNgoaiThanh.get(i).toString1());

        }
         
        System.out.println("Doanh thu từng chuyến xe: ");
        System.out.println("Doanh thu chuyến xe nội thành: " + doanhThuXeNoiThanh);
        System.out.println("Doanh thu chuyến xe ngoại thành: " + doanhThuXeNgoaiThanh);


    }
}
