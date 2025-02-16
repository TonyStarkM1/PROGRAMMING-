//Q12)WAJP TO CHECK THE GIVEN NUMBER IS SUNNY NUMBER OR NOT?

public class SunnyNumber {
    public static void main(String[] args) {
        int n = 15;
        int num = n + 1;
        int a = 0;
        for (int i = 0; i*i <= num; i++) {
            if (num == i*i){
                a = i*i;
                break;                
            }
        }
        if (a==num) {
            System.out.println(n + " is sunny number!!");
        }
        else{
            System.out.println(n + " is Not a Sunny number!!");
        }
    }
    
}
