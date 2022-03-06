package tamct2004110023k14dcpm02.Buoi06;

import java.util.Scanner;

public class TestSinhHoc {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("tâm", 200, 8, 8);
        SinhVien sv2 = new SinhVien("tâm", 200, 8, 8);
        System.out.println(sv1);
        System.out.println(sv2);

        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        System.out.println("Nhập họ và tên: ");
        sv.sethoVaTen(sc.nextLine());
        System.out.println("Nhập MSSV: ");
        sv.setmssv(sc.nextInt());
        System.out.println("Điểm LT: ");
        sv.setdiemLT(sc.nextInt());
        System.out.println("Điểm TH: ");
        sv.setdiemTH(sc.nextInt());
        System.out.println("Điểm trung bình: " +sv.diemTrungBinh());


    }
}

