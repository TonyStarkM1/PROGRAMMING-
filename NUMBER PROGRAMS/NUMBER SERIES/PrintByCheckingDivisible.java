// package NUMBER SERIES;

// Q4)WAJP to PRINT "HII" IF THE GIVEN NUMBER IS DIVISIBLE BY 3,
// 	 PRINT HELLO IF THE GIVEN NUMBER IS DIVISIBLE BY 5, 
// 	 PRINT "HII HELLO" IF THE GIVEN NUMBER IS DIVISIBLE BY 3&5,
// 	 PRINT BYY IF GIVEN NUMBER IS NOT DIVISIBLE BY 3&5 

public class PrintByCheckingDivisible {
    public static void main(String[] args) {
        int num = 5;
        if(num%3==0 && num%5==0){
            System.out.println("Hii Hello");
        }
        else if (num%3==0) {
            System.out.println("Hii");
        }
        else if(num%5==0){
            System.out.println("Hello");
        }
        else{
            System.out.println("Byy");
        }
    }    
}






// Tracing
/*_________________________________________________________________________________________________________________________
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |______________|_____________________|________________|____________________|______________________|_______________________|
 |     1        |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |     2        |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |     3        |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |     4        |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |______________|_____________________|________________|____________________|______________________|_______________________|
 */