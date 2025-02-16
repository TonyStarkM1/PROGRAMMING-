

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;
        int num1 = num;
        int num2 = num;
        int count = 0;
        int sum = 0;
//below while loop is to count the digit
        while(num!=0){
            count++;
            num = num/10;
        }
//below while loop is to get sum of each digit power of count
        while (num1!=0) {
          int rem = num1%10;
          int pow=1;
//below for loop is to multiply the number basewd on count
          for (int i = 1; i<=count; i++) {
            pow = pow*rem;
          }
          sum = sum + pow;
          num1 = num1 / 10;
        }
       if (sum == num2) {
        System.out.println(num2 + " is Armstrong number ");
        
       } else {
        System.out.println(num2 + " is  Not a Armstrong number ");

       }
        
    }    
}
