//Q13)WAJP TO IDENTIFY THE FACTORS OF GIVEN NUMBER?

// public class Factors_Of_Number {
//     public static void main(String[] args) {
//         int num = 60;
//         int a= 1;
        
//        while (a <= num ) {
//         if(num % a == 0){
//             System.out.println(a + " is factor of " + num);
//         } 
//         a++;           
//        }
//     }
// }



/////////////////////////////////////////////////////////////
/////////////////////Using for loop/////////////////////////
/// ////////////////////////////////////////////////////////

public class Factors_Of_Number {
    public static void main(String[] args) {
      int num = 12;        
       for (int i = 1; i <= num; i++){
          if(num%i==0){
            System.out.println(i + " is factor of " + num);          
          }
        }
    }
}