//Q12)WAJP TO DEFINE A METHOD WHICH RETURNS THE GIVEN CHARACTER IS ALPHABET OR DIGIT OR SPECIAL.

import java.util.Scanner;

public class MethodToIdentifyNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit or alphabet or special character");
        char ch=sc.next().charAt(0);
        String res=digitAlphabetChar(ch);
        System.out.println(ch+" is "+res);

    }
    public static String digitAlphabetChar(char ch){
        if (ch>='0' && ch<='9')
            return "Digit";
        else if (ch>'a'&& ch<'z' || ch>'A' && ch<'Z')
            return "Alphabet";
        else
            return "Special character";
    }  
}