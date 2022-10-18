import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:/Users/URJC/Desktop/abc.txt");
            File file2 = new File("C:/Users/URJC/Desktop/abc2.txt");

            List<String> firstFileLines= Files.readAllLines(file.toPath(), Charset.  defaultCharset());
            List<String> secondFileLines= Files.readAllLines(file2.toPath(), Charset.  defaultCharset());

            ArrayList<String> allLines=new ArrayList<String>();

            allLines.addAll(firstFileLines);
            allLines.addAll(secondFileLines);

            Collections.sort(allLines,String.CASE_INSENSITIVE_ORDER);


            FileWriter out = null;


            out = new FileWriter("C:/Users/URJC/Desktop/sort.txt");


            for(String str: allLines) {
                out.write(str + System.lineSeparator());
            }
            out.close();

        } finally {
            if ( in != null ) {
                in.close();
            }
            if ( out != null ) {
                out.close();
            }
        }

    }
}