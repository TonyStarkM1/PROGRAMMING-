//Q11)WAJP DEFINE A METHOD WHICH RETURNS THE GIVEN NUMBER IS EVEN OR ODD.

import java.util.Scanner;

public class MethodForEven_Odd {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        String res= evenOdd(num);
        System.out.println(num+" is "+res);
    }
    public static String evenOdd(int a){
        if (a % 2==0)
            return "Even Number";
        else
            return "Odd Number";

    }
}