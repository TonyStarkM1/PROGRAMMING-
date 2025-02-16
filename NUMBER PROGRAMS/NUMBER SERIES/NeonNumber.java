//Q11)WAJP TO CHECK THE GIVEN NUMBER IS NEON NUMBER OR NOT?

public class NeonNumber {
    public static void main(String[] args) {
        int num = 9;
        int Sq = num * num;
        int sum = 0;
        while (Sq != 0) {
            int ld = Sq % 10;
            sum = sum + Sq % 10;
            Sq=Sq/10;       
        }
        if (sum==num) {
            System.out.println(num + " is Neon number!!");
        }
        else{
            System.out.println(num + " is Not a Neon number!!");
        }
    }    
}


//=====================================================================//

// public class NeonNumber {
//     public static void main(String[] args) {
//         int num = 9;
//         int sq = num * num;
//         int sum = 0;
//         while (sq > 0) {
//             sum = sum + sq % 10;
//             sq=sq/10;            
//         }
//         if (sum==num) {
//             System.out.println(num + " is Neon number!!");
//         }
//         else{
//             System.out.println(num + " is Not a Neon number!!");
//         }
//     }    
// }
