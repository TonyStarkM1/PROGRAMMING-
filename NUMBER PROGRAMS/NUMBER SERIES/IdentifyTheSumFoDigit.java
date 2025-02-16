//Q8)WAJP TO IDENTIFY THE SUM OF DIGITS?

public class IdentifyTheSumFoDigit {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num!=0){
            int ld = num % 10;
            sum = sum + ld;
            num/=10;
        }
        System.out.println("Sum of digits is: "+sum);
    }    
}
