import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputstream = new FileInputStream("C:\\imagen\\b.bmp");


        byte[] data = new byte[1024];
        int bytesRead = inputstream.read(data);
        int size = ((data[2]*256) + (data[3]*256) + (data[4]*256) + (data[5]*256));
        int width = ((data[18]*256) + (data[19]*256) + (data[20]*256) + (data[21]*256));
        int height = ((data[22]*256) + (data[23]*256) + (data[24]*256) + (data[25]*256));
        int tpye = ((data[30]*256) + (data[31]*256) + (data[32]*256) + (data[33]*256));
       System.out.println(size);
        System.out.println(width);
        System.out.println(height);
        System.out.println(tpye);


           }
}