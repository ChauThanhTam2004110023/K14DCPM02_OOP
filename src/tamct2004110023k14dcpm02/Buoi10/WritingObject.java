package tamct2004110023k14dcpm02.Buoi10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class WritingObject {
    public static void main(String[] args) throws IOException{
        HangThucPham hangThucPham = new HangThucPham("01", "lẩu thái", 15000, new Date(), new Date());
        System.out.println(hangThucPham);
        //HangThucPham hangThucPham2 = new HangThucPham("02");

        //ghi vào 1 file cụ thể
        FileOutputStream outputStream = new FileOutputStream("htp.dat");

        //chuyển đối tượng sang dạng trung gian
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(hangThucPham);
        objectOutputStream.close();
    }
}
