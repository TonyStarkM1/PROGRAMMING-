//Q18)WAJP  TO CHECK THE GIVEN NUMBER IS STRONG NUMBER OR WEAK NUMBER?

public class Strong_Number {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;
        while (num != 0) {
           int  rem = num % 10;
           int fact = 1;
           for (int i = 1; i <= rem; i++){
                fact = fact * i;         
           }
           sum = sum + fact;
           num = num / 10;            
        }
        if (temp == sum) {
            System.out.println(temp + " is Strong Number");
            
        } else {
            System.out.println(temp + " is Not a Strong Number");
        }
    }    
}

/* 
    **num** --------**sum**------------**(num!=0)**-----------**fact = fact *      
      145              0                   true              
 
 
 */