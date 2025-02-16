//Q15)WAJP TO IDENTIFY THE AVERAGE OF THE FACTORS OF THE GIVEN NUMBER?

public class Average_Of_Factors {
    public static void main(String[] args) {
        int num = 12; 
        int sum = 0;
        int count = 0;
        int avg = 0; 
              
        for (int i = 1; i <= num; i++){
            if(num%i==0){
                sum = sum + i;
                count++;
            }
        }
        avg = sum/count;
        System.out.println(avg + " is the average of factorials");
    }
    
}
