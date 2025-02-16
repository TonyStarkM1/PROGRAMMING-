
import java.util.Scanner;

//Q17)WAJP TO DEFINE A METHOD WHICH RETURNS THE GIVEN NUMBER IS STRONG NUMBER OR WEAK NUMBER.

public class MethodForStrongOrWeakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sumFact = sumOfFactorial(num);
        String res = isFactorial(sumFact);
        System.out.println("The given number is: "+res);
    }                
    private static int sumOfFactorial(int num) {
        int sum =0;
        while (num>0) {
            int ld = num%10;
            int fact = 1;
            for(int i =1; i<=ld;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            num = num/10;            
        }
        return sum;                
    }   
    private static String isFactorial(int num) {
        if (num == sumOfFactorial(num))
            return  "Strong number";
        else
            return "Weak number";
    }                        
}
