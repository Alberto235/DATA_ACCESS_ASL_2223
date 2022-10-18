import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File Path = new File("c:/file");
        File f = new File(Path, "data.txt");
        String str;
        Scanner sc = new Scanner(System.in);
        PrintWriter pwe = null;
        boolean overwrite = true;
        int line = 0;



        try {
            if (!f.exists()) {
                System.out.println("File " + f.getName() + " not exists");
                if (!Path.exists()) {
                    System.out.println("Directory " + Path.getName() + " not exists");
                    if (Path.mkdir()) {
                        System.out.println("Directory Create");
                        if (f.createNewFile()) {
                            System.out.println("File " + f.getName() + " Create");
                        } else {
                            System.out.println("Could not create" + f.getName());
                        }
                    } else {
                        System.out.println("Could not create" + Path.getName());
                    }
                } else {
                    if (f.createNewFile()) {
                        System.out.println("File " + f.getName() + " create");
                    } else {
                        System.out.println("Could not create " + f.getName());
                    }
                }
            } else { //el fichero existe. Mostramos el tamaño
                System.out.println("File " + f.getName() + " exists");
                System.out.println("Size " + f.length() + " bytes");
            }

            System.out.println("Do you want to overwrite the data or not? insert true or false");
            boolean bn = sc.nextBoolean();
             sc.nextLine();
            FileWriter fw = new FileWriter(f, bn);


            try {
                pwe = new PrintWriter(fw);

                System.out.println("Enter text. To finish, enter the string END:");

                str = sc.nextLine();
                while (!str.equalsIgnoreCase("END")) {
                    line = line + 1;
                    pwe.println(line +" "+ str);
                    str = sc.nextLine();
                }
                pwe.flush();
            } finally {
                pwe.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
