package tamct2004110023k14dcpm02.Lab4;

public class TestSanPham {
    public static void main(String[] args) {
        SanPham sanPham = new SanPham("Vin", 500, 0.2, 10);
        System.out.println("ten san pham: " +sanPham.getTenSanPham());
        System.out.println("Don gia: " +sanPham.getdonGia());
        System.out.println("Giam gia: " +sanPham.getGiamGia());
        System.out.println("Thue nhap khau: " +sanPham.getThueNhapKhau());
    }
}
