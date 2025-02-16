//Q9)WAJP TO IDENTIFY THE AVERAGE OF DIGITS PRESENT IN THE NUMBER? 

public class AverageOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int sum = 0;
        while (num != 0) {
            int ld = num%10;
            sum+=ld;
            count++;
            num/=10;
        }
        System.out.println("Average of digit is "+sum/count);
    }



// ===============================================================================================

    // public static void main(String[] args) {
    //     int num=12345;
    //     int copy=num;
    //     int count=0;
    //     int sum=0;
    //     while (num!=0){
    //         count++;
    //         num=num/10;
    //     }
    //     while (copy>0){
    //         int ld=copy%10;
    //         sum=sum+ld;
    //         copy=copy/10;
    //     }
    //     int avg=sum/count;
    //     System.out.println(avg);
    // }
















}
