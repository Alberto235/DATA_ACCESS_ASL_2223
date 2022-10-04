import java.util.Scanner;
import java.util.regex.Pattern;

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
        String year="1999";
        int dayInt = 0;
        int monthInt = 0;
        int yearInt = 0;
        boolean correct = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert date");
        date = sc.nextLine();
        for (int i = 0; i <date.length(); i++){

            if (date.length()==10 && date.charAt(2)=='/'&& date.charAt(5)=='/'){
                day = date.substring(0,2);
                month = date.substring(3,5);
                year = date.substring(6,10);

            }else{
                System.out.println("Error in the date");
                System.exit(0);
            }
        }
        dayInt = Integer.parseInt(day);
        monthInt = Integer.parseInt(month);
        yearInt = Integer.parseInt(year);

        if ((dayInt>=1 && dayInt<=31) && (monthInt>=1 && monthInt<=12)){
        switch(monthInt){
            case 1: case 3:case 5: case 7: case 8:case 10:case 12:
                if(dayInt>=1 && dayInt<=31){
                    correct=true;
                }

                break;
            case 2:
                int max=28;
                if ((yearInt % 4 == 0) && ((yearInt % 100 != 0) || (yearInt % 400 == 0))){
                    max=29;
                }
                if (dayInt>=1 && dayInt<=max){
                    correct=true;
                }

                break;
            case 4: case 6: case 9: case 11:
                if (dayInt>=1 && dayInt<=30){
                    correct=true;
                }
                break;

            }
        }
        if (correct){
            System.out.println("the date is correct: "+ date);
        }
    }
}
