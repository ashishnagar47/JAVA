package Lec1;

import java.util.Scanner;

public class binary_decimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int no;
        int rem;
        for(int i=1;i<=n;i++){
            int deci=0;
            int place=1;
            no=s.nextInt();
            while(no>0){
                rem=no%10;
                deci=deci+rem*place;
                place=place*2;
                no=no/10;
            }
            System.out.println(deci);

        }

    }
}
