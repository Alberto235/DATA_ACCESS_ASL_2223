import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //File file = new File("C:/file/data.txt");

        Scanner s = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("C:/file/data.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        int i=0;
        try
        {
            String line = reader.readLine();
            while (line!=null) {

                System.out.println(line);


                line = reader.readLine();
                i = i + 1;
               if (i == 23){

                   System.out.println("Press any key to continue . . . ");
                   s.nextLine();

               }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}