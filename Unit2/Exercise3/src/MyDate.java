import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
     public MyDate(){

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void  requestDate(){
        String date= "";
        String day="";
        String month="";
        int dayInt = 0;
        int monthInt = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert date");
        date = sc.nextLine();
        for (int i = 0; i <date.length(); i++){

            if (date.length()==10 && date.charAt(2)=='/'&& date.charAt(5)=='/'){
                day = date.substring(0,2);
                month = date.substring(3,5);

            }
        }
        dayInt = Integer.parseInt(day);
        monthInt = Integer.parseInt(month);

        if ((dayInt>=1 && dayInt<=31) && (monthInt>=1 && monthInt<=12)){

            System.out.println("the date is correct: "+ date);

        }else {
            System.out.println("your date is not correct");
        }
    }
}
