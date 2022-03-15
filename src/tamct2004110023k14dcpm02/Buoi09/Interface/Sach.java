package tamct2004110023k14dcpm02.Buoi09.Interface;

import java.util.Scanner;

public class Sach {
    private String maSach, nhaSanXuat;
    private double donGia;
    private int soLuong;
    Scanner sc = new Scanner(System.in);
    public Sach()
    {

    }

    public Sach(String maSach, String nhaSanXuat, double donGia, int soLuong)
    {
        super();
        this.maSach = maSach;
        this.nhaSanXuat = nhaSanXuat;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String getMaSach()
    {
        return maSach;
    }
    public void setMaSach(String maSach)
    {
        this.maSach = maSach;
    }
    public String getNhaSanXuat()
    {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat)
    {
        this.nhaSanXuat = nhaSanXuat;
    }
    public double getDonGia()
    {
        return donGia;
    }
    public void setDonGia(double donGia)
    {
        this.donGia = this.donGia;
    }
    public int getSoLuong()
    {
        return soLuong;
    }
    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }

    public void nhapSach()
    {
        System.out.println("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.println("Nhà xuất bản: ");
        nhaSanXuat = sc.nextLine();
        System.out.println("Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.println("Số lượng: ");
        soLuong = sc.nextInt();
    }
    @Override
    public String toString() {
        return "Mã sách: " +this.maSach+ "nhà xuất bản: " +this.nhaSanXuat+ "đơn giá: " +this.donGia+ "Số lượng: " +this.soLuong;
    }
}
