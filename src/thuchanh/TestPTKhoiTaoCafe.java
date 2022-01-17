package thuchanh;

public class TestPTKhoiTaoCafe {
    public static void main(String[] args) {
        PTKhoiTaoCafe pt = new PTKhoiTaoCafe("Trung Nguyên", 150000, 1.5);
        System.out.println("Tính tổn tiền: " +pt.tinhTongTien());
        System.out.println("kiểm tra khối lượng > 2: " +pt.kiemTraKhoiLuong(2));
        System.out.println("Kiểm tra tổng tiền > 50000: " +pt.kiemTraTongTien());
        System.out.println("Giảm gia > 500000: " +pt.giamGia(5));
        System.out.println("Sau khi giảm giá: " +pt.sauKhigiamGia(5));
        System.out.println("\n");

        PTKhoiTaoCafe pt1 = new PTKhoiTaoCafe("Trung Nguyên", 15000, 2.0);
        System.out.println("Tính tổn tiền: " +pt1.tinhTongTien());
        System.out.println("kiểm tra khối lượng > 2: " +pt1.kiemTraKhoiLuong(2));
        System.out.println("Kiểm tra tổng tiền > 50000: " +pt1.kiemTraTongTien());
        System.out.println("Giảm giá > 500000: " +pt1.giamGia(5));
        System.out.println("Sau khi giảm gia: " +pt1.sauKhigiamGia(5));
        System.out.println("\n");

        PTKhoiTaoCafe pt2 = new PTKhoiTaoCafe("Trung Nguyên", 500000, 6.0);
        System.out.println("Tính tổn tiền: " +pt2.tinhTongTien());
        System.out.println("kiểm tra khối lượng > 2: " +pt2.kiemTraKhoiLuong(2));
        System.out.println("Kiểm tra tổng tiền > 50000: " +pt2.kiemTraTongTien());
        System.out.println("Giảm giá > 500000: " +pt2.giamGia(5));
        System.out.println("Sau khi giảm giá: " +pt2.sauKhigiamGia(5));
    }
}
