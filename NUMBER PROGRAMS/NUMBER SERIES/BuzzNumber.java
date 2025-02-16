//Q17)WAJP TO CHECK THE GIVEN NUMBER IS BUZZ NUMBER OR NOT?
//NOTE: IF ANY NUMBER IS ENDS WITH 7 OR DIVISIBLE BY 7 THEN THIS NUMBER IS BUZZ NUMBER.
public class BuzzNumber {
    public static void main(String[] args) {
        int num = 49;
        if (num%10==0 || num%10==7) {
            System.out.println(num + " is Buzz Number");
        }
        else{
            System.out.println(num + " is Not a buzz Number");
        }
    }
}




/*
 public class BuzzNumber {
    public static void main(String[] args) {
        int num = 17;
        int ld = num%10;
        if (num%10==0 || ld==num) {
            System.out.println(num + " is Buzz Number");
        }
        else{
            System.out.println(num + " is Not a buzz Number");
        }
    }
}
 */