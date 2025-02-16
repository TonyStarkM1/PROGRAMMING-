//Q15)WAJP TO DEFINE A METHODS WHICH RETURNS THE REVERSE NUMBER, AND A METHOD WHICH RETURNS THE NUMBER IS PALINDROME OR NOT.

import java.util.Scanner;

public class MethodToReturnReverseAndPalindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rev=reverse(num);
        String res=isPalindrome(num,rev);
        System.out.println("The given number is: "+res);  
    }

     public static int reverse(int num){
        int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
    public static String isPalindrome(int num, int rev){
        if (num==rev)
            return " palindrome Number";
        else
            return " Not a palindrome Number";
    }
}
