//Q12)WAJP TO CHECK THE GIVEN NUMBER IS PALLINDROME?

public class Pallindrome_Number {
    public static void main(String[] args) {
        int num = 1221;
        int temp = num;
        int rev = 0;
        int rem = 0;
        while(num != 0){
            //Here we extracting the last Digit.
             rem = num % 10;
             //Here we storing the value in rev container. 
             rev = rev * 10 + rem;
             //Here we remove the last digit of given number
             num = num / 10;    
        }
        if(temp == rev){
            System.out.println(temp+ " is Pallindrome Number!!!!");
        }
        else{
            System.out.println(temp + " is not a Pallindrome Number!!!");
        }
    }
}
    
