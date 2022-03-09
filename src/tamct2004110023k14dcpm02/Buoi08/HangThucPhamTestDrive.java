package tamct2004110023k14dcpm02.Buoi08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        HangThucPham hangThucPham = new HangThucPham("m01");
        //hangThucPham.setMaHang("1");
        //hangThucPham.toString();
        //System.out.println(hangThucPham);
        Date ngayHienTai = new Date();
        System.out.println(ngayHienTai);

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySx = "01/03/2022";
        String ngayHetHan = "10/03/2022";
        HangThucPham hangThucPham2 = new HangThucPham("01", "Lẩu Thái", 7000, ngayVietNam.parse(ngaySx), ngayVietNam.parse(ngayHetHan));
        System.out.println(hangThucPham2);

        if(hangThucPham2.kiemTraHang())
        {
            System.out.println("Hết hạn r");
        }
        else
        {
            System.out.println("Còn hạn");
        }
    }
}
