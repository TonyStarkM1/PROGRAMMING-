//Q7)WAJP TO COUNT THE NUMBER OF DIGIT PRESENT IN A GIVEN NUMBER?

public class CountTheDigitInNumber {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        System.out.println("Number of digit in number is "+count);
    }
    
}
