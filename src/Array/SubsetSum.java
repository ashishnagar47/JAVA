package Array;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t; i++) {
            int n=s.nextInt();
            int[] arr=new int[n];
            String p="";
            for (int j = 0; j <n ; j++) {
                arr[i]=s.nextInt();
                p=p+arr[i];
            }
            sum(p,"");
        }
    }
    public static void sum(String p,String unprocessed){
        if(p.isEmpty()){
            int sum=0;
            for (int i = 0; i <unprocessed.length() ; i++) {
                sum=sum+Character.getNumericValue(unprocessed.charAt(i));
            }
            if(sum==0){
                System.out.println("Yes");
                return;
            }
            return;
        }
        char ch=p.charAt(0);
        sum(p.substring(1),unprocessed);
        sum(p.substring(1),unprocessed+ch);
    }
}
