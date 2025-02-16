//Q21)WAJP TO CHECK THE GIVEN NUMBER IS PERFECT NUMBER OR NOT?
public class PerfectNumber1 {
    public static void main(String[] args) {
        int num = 81;
        int a = 0;
        //condition can be i*i <= num also // it reduce the itteration
        for(int i = 1; i<= num/2; i++){
            if(num == i*i){
                a = i  * i;
                break;
            }
        }
        if(a==num){
            System.out.println(num + " is Perfect Square");
        }
        else{
            System.out.println(num + " is Not Perfect Square");

        }
    }    
}



/*____________________________________________________________________________________________________________________________
 |  for loop    |                     |                |                    |                      |                       |
 |   int i = 1  |     i<=num          |      i++       |     if(num==i*i)   |                      |                       |
 | ____________ |_____________________|________________|____________________|______________________|_______________________|
 |     1        |      1<=9           |                |         9==1       |                      |                       |
 |              |                     |                |                    |                      |                       |
 |     2        |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |     3        |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |              |                     |                |                    |                      |                       |
 |______________|_____________________|________________|____________________|______________________|_______________________|
 */