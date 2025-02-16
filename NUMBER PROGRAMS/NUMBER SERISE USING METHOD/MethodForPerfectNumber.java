
import java.util.Scanner;

//Q16)WAJP TO DEFINE A METHOD WHICH RETURNS THE GIVEN NUMBER IS PERFECT OR NOT.

public class MethodForPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = SumOfFactors(num);
        String res =isPerfect(num,sum);
        System.out.println("The given number is : "+res);
                
    }
                
            private static String isPerfect(int num, int sum) {
                if (num == sum) 
                    return "Perfect Number";
                else
                return "Not a Perfect Number";
            }
        
            private static int SumOfFactors(int num) {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        sum = sum + i;
                    }
                }
                return sum;
            }
    
}
