package Lec1;

import java.util.Scanner;

public class Lecture_1 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if (a % 4 == 0) {
            System.out.println("Leap Year");

        } else {
            System.out.println("not a leap year");
        }

    }

    public static class loops {
        public static void main(String[] args) {
            int i=1;
            while (i<=10){
                System.out.println(i);
                i++;
            }
        }
    }
}
