package tamct2004110023k14dcpm02.Buoi09.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SachGiaoKhoa> arSachGiaoKhoa = new ArrayList<>();
        List<SachThamKhao> arSachThamKhao = new ArrayList<>();
        int soSachGiaoKhoa, soSachThamKhao;
        double tongTienSachGiaoKhoa = 0;
        double tongTienSachThamKhao = 0;
        double tongDonGiaSachGiaoKhoa = 0;
        double tongDonGiaSachThamKhao = 0;
        double trungBinhCongDonGia = 0;

        System.out.println("nhập số sách giáo khoa: ");
        soSachGiaoKhoa = sc.nextInt();
        System.out.println("nhập số sách tham khảo: ");
        soSachThamKhao = sc.nextInt();

        System.out.println("nhập thông tin sách giáo khoa: ");
        for(int i = 0; i < soSachGiaoKhoa; i++)
        {
            System.out.println("nhập thông tin sách thứ: " +(i + 1)+ ": ");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arSachGiaoKhoa.add(sachGiaoKhoa);
        }

        System.out.println("nhập thông tin sách tham khảo: ");
        for(int i = 0; i < soSachThamKhao; i++)
        {
            System.out.println("nhập thông tin sách thứ: " +(i + 1)+ ": ");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapSach();
            arSachThamKhao.add(sachThamKhao);
        }

        for(int i = 0; i < arSachGiaoKhoa.size(); i++)
        {
            if(arSachGiaoKhoa.get(i).getNumber() == 0)
            {
                tongTienSachGiaoKhoa += arSachGiaoKhoa.get(i).getSoLuong() * arSachGiaoKhoa.get(i).getDonGia() * 50/100;
            }
            else if(arSachGiaoKhoa.get(i).getNumber() == 1)
            {
                tongTienSachGiaoKhoa += arSachGiaoKhoa.get(i).getSoLuong() * arSachGiaoKhoa.get(i).getDonGia();
            }
        }

        for(int i = 0; i < arSachThamKhao.size(); i++)
        {
            if(arSachThamKhao.get(i).getNumber() == 0)
            {
                tongTienSachThamKhao += arSachThamKhao.get(i).getSoLuong() * arSachThamKhao.get(i).getDonGia() *50/100;
            }
            else if(arSachThamKhao.get(i).getNumber() == 1)
            {
                tongTienSachThamKhao += arSachThamKhao.get(i).getSoLuong() * arSachThamKhao.get(i).getDonGia();
            }
        }
        System.out.println("tổng tiền sách giáo khoa: " +tongTienSachGiaoKhoa);
        for(int i = 0; i < arSachGiaoKhoa.size(); i++)
        {
            tongDonGiaSachGiaoKhoa += arSachGiaoKhoa.get(i).getSoLuong() * arSachGiaoKhoa.get(i).getDonGia() + arSachGiaoKhoa.get(i).getThue();
        }

        System.out.println("tổng tiền sách tham khảo: " +tongTienSachThamKhao);
        for(int i = 0; i < arSachThamKhao.size(); i++)
        {
            tongDonGiaSachThamKhao += arSachThamKhao.get(i).getSoLuong() * arSachThamKhao.get(i).getDonGia() + arSachThamKhao.get(i).getThue();
        }

        System.out.println("------Thông tin sách giáo khoa------");
        for(int i = 0; i < arSachGiaoKhoa.size(); i++)
        {
            System.out.println(arSachGiaoKhoa.get(i).toString());
        }

        System.out.println("------Thông tin sách tham khảo--------");
        for(int i = 0; i < arSachThamKhao.size(); i++)
        {
            System.out.println(arSachThamKhao.get(i).toString());
        }

        System.out.println("Trung bình cộng đơn giá các sách tham khảo");
        for(int i = 0; i < arSachGiaoKhoa.size(); i++)
        {
            tongDonGiaSachThamKhao += arSachThamKhao.get(i).getDonGia();
            trungBinhCongDonGia = tongDonGiaSachThamKhao / arSachThamKhao.size();
        }

        System.out.println("Trung bình cộng đơn giá các sách tham khảo = " +trungBinhCongDonGia);
        for(int i = 0; i < arSachGiaoKhoa.size(); i++)
        {
            if(arSachGiaoKhoa.get(i).getNhaSanXuat().equalsIgnoreCase("X"))
            {
                System.out.println(arSachGiaoKhoa.get(i).toString());
            }
        }
    }
}
