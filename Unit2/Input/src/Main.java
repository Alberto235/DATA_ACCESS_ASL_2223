import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) throws IOException {
        //InputStream inputstream = new FileInputStream("C:\\Profesores\\Personas4.txt");
        //int data = inputstream.read();
        /*while(data != -1){
            System.out.print((char) data);
            data = inputstream.read();
        }*/


        InputStream inputstream = new FileInputStream("C:\\imagen\\v.ico");

        byte[] data = new byte[1024];
        int bytesRead = inputstream.read(data);
       /* System.out.println(data[0] + "#" + (byte) 0x00 );
        System.out.println(data[1] + "#" + (byte) 0x00 );
        System.out.println(data[2] + "#" + (byte) 0x01 );
        System.out.println(data[3] + "#" + (byte) 0x00 );

        */
        if (data[0] == (byte)0x00 && data[1] ==(byte)0x00 && data[2] == (byte)0x01 && data[3]== (byte)0x00){
            while (bytesRead != -1) {


                bytesRead = inputstream.read(data);

                doData(data, bytesRead);


            }

        inputstream.close();
        }
    }

    private static void doData(byte[] data, int bytesRead) {
        int i=0;
        i++;
        System.out.println(data[i] + "/" + bytesRead);
    }


}