//Q16)WAJP TO CHECK THE GIVEN NUMBER IS AUTOMORPHIC OR NOT?

public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 6;
        int sq = num*num;
        boolean flag = true;
            while(num!=0){
                if (num%10 == sq%10) {
                    num = num/10;
                    sq = sq / 10;
                }else{
                    flag = false;
                break;
                }
            }
        if (flag==true) {
            System.out.println("Automorphic");  
        }
        else{
            System.out.println("Not the Automorphic");
        }
    }      
        
}
