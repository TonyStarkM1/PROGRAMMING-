//Q14)WAJP TO DEFINE A METHODS WHICH RETURNS THE AVG VALUE.

import java.util.Scanner;

public class MethodToReturnAvgValue {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=sumOfDigits(num);
        System.out.println("The sum of digits is: "+sum);
        int count=countDigits(num);
        System.out.println("The count of digits is: "+count);
        int res=avg(sum,count);
        System.out.println("The avg value is "+res);
    }

     public static int countDigits(int num){
        int count=0;
        while (num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while (num!=0){
            int ld=num%10;
            sum=sum+ld;
            num=num/10;
        }
        return sum;
    }
    public static int avg(int sum,int count){
        return sum/count;
    }
}
