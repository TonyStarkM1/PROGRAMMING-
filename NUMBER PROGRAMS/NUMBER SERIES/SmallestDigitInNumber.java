//Q10)WAJP  TO IDENTIFY THE SMALLEST DIGIT IN A NUMBER?

public class SmallestDigitInNumber {
    public static void main(String[] args) {
        int num = 12345;
        int smallest = 9;
        while (num!=0) {
            int ld = num %10;
            if(ld<smallest){
                smallest=ld;
            }
            num/=10;            
        }
        System.out.println(smallest  + " is Smallest ");
    }
}
