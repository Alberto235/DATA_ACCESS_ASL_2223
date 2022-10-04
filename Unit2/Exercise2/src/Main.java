import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String date= "";
        String day="";
        String month="";
        int dayInt = 0;
        int monthInt = 0;
        Scanner sc = new Scanner(System.in);

      System.out.println("Insert date");
      date = sc.nextLine();
      for (int i = 0; i <date.length(); i++){
          System.out.println(i);
          if (date.length()==10 && date.charAt(2)=='/'&& date.charAt(5)=='/'){
                day = date.substring(0,2);
                month = date.substring(3,5);
              System.out.println(day);
          }
        }
       dayInt = Integer.parseInt(day);
       monthInt = Integer.parseInt(month);
        System.out.println(dayInt);
      if ((dayInt>=1 && dayInt<=31) && (monthInt>=1 && monthInt<=12)){

          System.out.println("the date is correct: "+ date);

      }else {
          System.out.println("your date is not correct");
      }

    }
}