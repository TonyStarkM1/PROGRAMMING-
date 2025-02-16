//Q14)WAJP TO IDENTIFY SUM OF FACTORS OF A GIVEN NUMBER?

public class Sum_Of_Factors {
    public static void main(String[] args) {
        int num = 12; 
        int sum = 0;       
        for (int i = 1; i <= num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        System.out.println(sum + " is the sum of factor.");
    }
}
