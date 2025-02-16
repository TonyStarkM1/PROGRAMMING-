//Q13)WAJP TO DEFINE A METHOD WHICH RETURNS THE LAST DIGIT OF GIVEN NUMBER.

import java.util.Scanner;

public class MethodForReturnLastDigit {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int a=sc.nextInt();
        int res=lastDigit(a);
        System.out.println("Last digit of " + a + " is "+res);
    }
    public static int lastDigit(int num){
        int ld=num %                                                                                                                                                                                                                                                                                                               10;
        return ld;
    }   
    
}