package tamct2004110023k14dcpm02.CuoiKy;

public class HangDienMay extends KhoHang{
    private String tGBaoHanh;
    private String congSuatKW;
    

    public HangDienMay(String tGBaoHanh, String congSuatKW) {
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }

    public HangDienMay(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia,
            String tGBaoHanh, String congSuatKW) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }

    @Override
    public String toString() {
        return " Thời gian bào hành: " +tGBaoHanh+ " công suất KW: " +congSuatKW;
    }
    
}
