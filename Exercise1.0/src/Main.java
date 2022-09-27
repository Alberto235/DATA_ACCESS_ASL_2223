import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String Letters = "";
        int numLetters = 0;
        char minLetter = Character.MIN_VALUE;
        char maxLetter = Character.MAX_VALUE;
        int numUpperCase = 0;

        boolean exit = false;

        while (numLetters < 10 && !exit){

            System.out.println("Enter a letter. Press 0 if you want to exit: ");
            Scanner sc = new Scanner(System.in);
            char letterAux = sc.next().charAt(0);
            System.out.println("");
            System.out.println("-------");
            Letters = Letters + String.valueOf(letterAux);

            if(Letters.charAt(numLetters) == 0){
                exit = true;
            }
            if (minLetter > letterAux){
                minLetter = letterAux;
            }
            if (maxLetter < letterAux){
                maxLetter = letterAux;
            }
            numLetters++;

        }
        if (numLetters > 50){
            System.out.println("The character string is full");
        }
        for (int i = 0; i < numLetters && Letters.charAt(i) != '0'; i++){
            if ((Letters.charAt(i) >= 'A') && (Letters.charAt(i) <= 'Z')){
                numUpperCase++;
            }
        }
        System.out.println("the minor Char is : " +
                minLetter);
        System.out.println("the older Char is: " + maxLetter);
        System.out.println("There is " + numUpperCase + " uppercase ");

    }
}