// Q13)WAJP TO CHECK THE GIVEN NUMBER IS XYLEM OR PHOLEM?

public class XylemOrPhloem {
    public static void main(String[] args) {
        int num = 1234;
        int ld = num % 10;
        num = num / 10;
        int insum = 0;
        while (num > 9) {
        insum = insum + num % 10;
            num = num/10;            
           }
           int outsum = num + ld;
           if (insum==outsum) {
            System.out.println("XYLEM");            
           }
           else{
            System.out.println("PHLOEM");          
           }        
    }   
}
