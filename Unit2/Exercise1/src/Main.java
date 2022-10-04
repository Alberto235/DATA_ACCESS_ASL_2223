import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, surName;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your surname: ");
        surName = sc.nextLine();
        System.out.println("Hello, " +name+ " "+ surName);

    }
}