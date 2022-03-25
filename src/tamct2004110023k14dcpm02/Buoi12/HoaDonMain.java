package tamct2004110023k14dcpm02.Buoi12;

public class HoaDonMain {
    public static void main(String[] args) {
        DanhSachHoaDOn danhSachHoaDOn = new DanhSachHoaDOn();
        String nhapTiep = null;

        ConsleInput consleInput = new ConsleInput();
        do
        {
            HoaDon hoaDon = consleInput.inPutHoaDon();
            danhSachHoaDOn.them(hoaDon);
            System.out.println("Co muon nhap them hay khong 0/1");
            nhapTiep = consleInput.sc.nextLine();
        }
        while(nhapTiep.equalsIgnoreCase("0"));
        
        danhSachHoaDOn.inDangSach();
        double tinhTienHD = danhSachHoaDOn.tinhTienHD();
        System.out.println("tien t3-2022: " +tinhTienHD);

        String maHD = "HD001";
        HoaDon hoaDon = danhSachHoaDOn.timHoaDonNgayTheoMa(maHD);
        HoaDonTheoNgay hoaDonTheoNgay = danhSachHoaDOn.timHoaDonNgayTheoMa(maHD);
        danhSachHoaDOn.xoaHoaDon(hoaDonTheoNgay);
        danhSachHoaDOn.xoaHoaDon(hoaDon);


    }
}
