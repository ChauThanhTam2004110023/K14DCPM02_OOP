package tamct2004110023k14dcpm02.CuoiKy;

public abstract class KhoHang {
    private String tenHang;
    private String loaiHang;
    private String maHang;
    //private String nhaCungCap;
    private int soLuongTonKho;
    private double donGia;
    //private Date ngaySX;
    //private Date ngayHetHan;

    public KhoHang()
    {

    }

    public KhoHang(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia) {
        this.tenHang = tenHang;
        this.loaiHang = loaiHang;
        //this.nhaCungCap = nhaCungCap;
        this.maHang = maHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
        //this.ngaySX = ngaySX;
        //this.ngayHetHan = ngayHetHan;
    }

    /* public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getLoaiHang() {
        return loaiHang;
    }
    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }
     public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }  */

    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    } 

   
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
            this.maHang = maHang;
    }

    /* public Date getNgaySX() {
        return ngaySX;
    }
    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    } */

    @Override
    public String toString() {
        //Locale locale = new Locale("Vi", "VN");
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        //String str1 = simpleDateFormat.format(ngaySX);
        //String str2 = simpleDateFormat.format(ngayHetHan);
        return "Kho H??ng: [t??n h??ng: " +tenHang+ " lo???i h??ng: " +loaiHang+ " m?? h??ng: " +maHang+ " s??? l?????ng t???n kho: " +soLuongTonKho+ " ????n gi??: " +donGia+ /* " ng??y s???n xu???t: " +str1+ " ng??y h???t h???n: " +str2+*/ "]";
    }

    /* public void setNSX(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngaySX = calendar.getTime();
    }

    public void setHSD(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayHetHan = calendar.getTime();
    } */
}
