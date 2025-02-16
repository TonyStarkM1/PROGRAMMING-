// Q19)WAJP TO CHECK THE GIVEN NUMBER IS PRIME NUMBER OR NOT?

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;                
            }
            System.out.println("Count Is : " +count);   
        }
        if (count == 2) {

            System.out.println(num + " is Prime Number");
        }
        else{
            System.out.println(num + " is Not A prime Number");
        }     
    }    
}
