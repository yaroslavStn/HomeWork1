import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        //  doFindMax();
        //findCentury(2019);
        //isYearLeap(2019);
        //System.out.println(Arrays.toString(doTask4()));
        //printArray();
        //sumNumericOfNumber((int) (Math.random() * 1000));
        // printSecondToDate(86401);//(int) (Math.random()*100000));
        // out.println(formatDuration(3601));
        System.out.println(divisibleByThree ("1122"));

    }

    private void doFindMax() {

        int a = 10;
        int b = 20;

        if (a > b) {
            out.println(a);
        } else {
            out.println(b);
        }
    }

    //2000 год это 21 век по определению, но для условий задачи - 20
    private void findCentury(int year) {

        int century = 0;

        if (year % 100 == 0) {
            century = ((year) / 100);
            out.println(century);
        } else {
            century = (year / 100) + 1;
            out.println(century);
        }
    }

    private boolean isYearLeap(int year) {

        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

    }

    private int[] doTask4() {

        int[] array = new int[10];
        int firstNum = 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = firstNum;
            firstNum++;
        }
        return array;

    }

    private void printArray() {
        double[] array = new double[(int) (Math.random() * 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 1000) - 500;
        }

        if (array.length == 0) {
            out.println("array is empty");
        } else {
            out.print("(");
            for (int i = 0; i < array.length; i++) {
                out.printf("%.2f", array[i]);
                if (i != array.length - 1) {
                    out.print(", ");
                }
            }
            out.print(")");
        }
    }

    private void sumNumericOfNumber(int num) {
        int sum = 0;
        out.println("num= " + num);

        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        out.println("sum = " + Math.abs(sum));
    }

    private void printSecondToDate(int num) {

        out.println(num);

        int day = num / 86400;
        num %= 86400;
        int hour = num / 3600;
        num %= 3600;
        int min = num / 60;
        int sec = num % 60;
        String point;


        if (day != 0) {
            point = day > 1 ? " days" : " day";
            out.print(day + point);
            point = hour > 0 ? ", " : ". ";
            out.print(point);
        }

        if (num <= 0) {
            out.println("try again");
        }

        if (hour != 0) {
            point = hour > 1 ? " hours" : " hour";
            out.print(hour + point);
            point = min > 0 ? ", " : ". ";
            out.print(point);
        }

        if (min != 0) {
            point = min > 1 ? " minutes" : " minute";
            out.print(min + point);
            point = sec > 0 ? " and " : ". ";
            out.print(point);
        }

        if (sec != 0) {
            point = sec > 1 ? " seconds." : " second.";
            out.println(sec + point);
        }
    }

    private String formatDuration(int num) {

        StringBuffer time = new StringBuffer();

        if (num <= 0) time.append("try again");
        int day = num / 86400;
        if (day != 0) time.append(day).append(day > 1 ? " days" : " day").append(num %86400 > 0 && num/86400%3600 ==0 ? ", " : "");
        num %= 86400;
        int hour = num / 3600;
        if (hour != 0) time.append(hour).append(hour > 1 ? " hours" : " hour").append(num %3600 > 0 && num/3600%60 ==0 ? ", " : "");
        num %= 3600;
        int min = num / 60;
        if (min != 0) time.append(min).append(min > 1 ? " minutes" : " minute");
        time.append(num %60 > 0 ? " and " : "");
        int sec = num % 60;
        if (sec != 0) time.append(sec).append(sec > 1 ? " seconds" : " second");
        time.append(".");
        return time.toString();
    }

    private boolean divisibleByThree(String number) {
        char [] symbols = number.toCharArray();
        int sum = 0;

        for (int ascii : symbols) {
            if (ascii < 58 && ascii > 48) {
                sum += ascii;
            }
        }

        return sum != 0 && sum % 3 == 0;
    }
}