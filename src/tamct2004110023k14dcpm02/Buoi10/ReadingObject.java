package tamct2004110023k14dcpm02.Buoi10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("htp.dat");
        ObjectInputStream outFile = new ObjectInputStream(inputStream);
        HangThucPham htp = (HangThucPham) outFile.readObject();
        System.out.println(htp);
        
    }
}
