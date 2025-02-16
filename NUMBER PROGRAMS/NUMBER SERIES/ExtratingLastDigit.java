//Q5)WAJP TO EXTRACT THE LAST DIGIT FROM THE GIVEN NUMBER 1234?

public class ExtratingLastDigit {
    public static void main(String[] args) {
//         int num = 1234;
//         int d = num % 10;
//         System.out.println(d + " is last digit.");
//     }
// }

// ======================================================================
      int num=1234;
        while (num!=0){
          int ld=num%10;
          System.out.println(ld);
          num=num/10;
        }
    }
}