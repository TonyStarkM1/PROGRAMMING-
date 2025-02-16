//Q16)WAJP TO IDENTIFY FACTORIAL OF A GIVEN NUMBER?

// public class Factorial_Of_Number {
//     public static void main(String[] args) {
//         int num = 5;
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;            
//         }
//         System.out.println("Factorial of "+ num +" is " + fact);
//     }
// }




public class Factorial_Of_Number {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for (int i = num; i>0; i--) {
            fact = fact * i;            
        }
        System.out.println("Factorial of "+ num +" is " + fact);
    }
}