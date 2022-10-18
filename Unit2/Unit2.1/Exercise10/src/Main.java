import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the data: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        File file = new File("C:/file/data.txt");

        List<String> lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        for (String line : lines){
            if (line.contains(data)){
                System.out.println(line);
            }
        }

    }
}