// Q20)WAJP TO PRINT THE PRIME NUMBER BETWEEN THE GIVEN RANGE?

public class PrimeNumbersFromRange {
    public static void main(String[] args) {
        int start = 3;
        int end = 12;
        for (int num = start; num <= end; num++) {
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) 
                    count++;                  
            } 
            if (count == 2) 
                System.out.println(num);          
        }
    }    
}
