//Q14)WAJP TO CHECK THE GIVEN NUMBER IS HAPPY NUMBER OR SAD NUMBER?

public class HappyOrSadNumber {
    public static void main(String[] args) {
       int num=1;
       int temp = num;
       while (true) {
        int sum=0;
		while(num != 0){
			int ld = num % 10;
			int sq = ld * ld;
			sum = sum + sq ;  // or sum +=sq;  
			num = num/10;     // or num /= 10;
		}
		if (sum==1) {
            System.out.println(temp + "  is a Happy Number!!");  
            break;          
        }
        else if (sum==4) {
            System.out.println(temp + " is a Sad Number!!!"); 
            break;  
        }
        num = sum;       
       } 
    }
}
