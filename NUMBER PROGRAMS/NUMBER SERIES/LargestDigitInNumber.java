//Q11)WAJP TO IDENTIFY THE LARGEST DIGIT IN A NUMBER?

public class LargestDigitInNumber {
    public static void main(String[] args) {
        int num = 12345;
        int largest = 0;
        while (num!=0) {
            int ld = num %10;
            if(ld>largest){
                largest=ld;
            }
            num/=10;            
        }
        System.out.println(largest  + " is Largest ");
    }
}
    

