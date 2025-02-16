//Q19)WAJP FOR FIBONACCI SERIES?

public class FibonassiSeries {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        System.out.print(a+", " + b);
        for(int i = 1; i<=num-2 ; i++){
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(", "+sum);
        }
    }    
}
