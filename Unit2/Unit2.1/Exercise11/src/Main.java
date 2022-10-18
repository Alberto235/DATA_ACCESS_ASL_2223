import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectsFile = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/URJC/Desktop/contacts.obj")));
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int contador = 0;
        String name;
        String surname;
        String email;
        String phone;

        System.out.println("How many people do you want to add to the list?");
        i = Integer.parseInt(sc.nextLine());
        objectsFile.writeInt(i);
       do {
           
            System.out.println("Insert a name");
            name = sc.nextLine();
            System.out.println("Insert a Surname");
            surname = sc.nextLine();
            System.out.println("Insert a email");
            email = sc.nextLine();
            System.out.println("Insert a phone");
            phone = sc.nextLine();

           Contact ct = new Contact(name, surname, email, phone);
           objectsFile.writeObject(ct);
           contador++;
       }while (contador<i);

       
        objectsFile.close();

        ObjectInputStream objectsFile2 = new ObjectInputStream(new FileInputStream(new File("C:/Users/URJC/Desktop/contacts.obj")));

        int numObjects = objectsFile2.readInt();
        for (; numObjects > 0; numObjects--) {
            Contact ct = (Contact) objectsFile2.readObject();
            ct.write();
        }

    }
}