//Q18)WAJP TO CHECK THE GIVEN NUMBER IS DISARIUM NUMBER OR NOT?

public class DisariumNumber {
    public static void main(String[] args) {
        int num = 135;
        int num1 = num;
        int num2 = num;
        int count = 0;
        while (num != 0) {
            count++;
            num/=10;            
        }
        int sum = 0;
        while (num1 != 0) {
            int rem = num1%10;
            int pow = 1;
            for(int i = 1; i<=count; i++){
             pow = pow * rem;
            }
            count--;
            sum = sum + pow;
            num1 = num1/10;
        }
        if (sum == num2) {
            System.out.println(num2 + " is Disarium Number");            
        }
        else{
            System.out.println(num2 + " is Not a Disarium Number");
        }
    }
}
