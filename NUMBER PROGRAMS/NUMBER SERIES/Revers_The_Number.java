//Q11)WAJP TO REVERSE THE GIVEN NUMBER?

public class Revers_The_Number {
    public static void main(String[] args) {
        int num = 1234;
        int temp = num;
        int rev = 0;
        int rem = 0;
        while(num != 0){
            //Here we extracting the last Digit.
             rem = num % 10; 
             //Here we storing the value in rev container.      
             rev = rev * 10 + rem; 
             //Here we remove the last digit of given number.
             num = num / 10;       
        }
        System.out.println("The reverse of givent number "+ temp +" is " +rev);
    }
}
