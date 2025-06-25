
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number greater than 0");
        int a = sc.nextInt();
        
        if(a <= 0)
        {
            System.out.println("the number should be greater than 0");
            return;
        }

        if(a % 2 == 0){
            a --;
        }
        int temp = 1;
        
        while(a > 1){
            System.out.print(temp + ", ");
            temp += 2;
            a --;
        }
        System.out.println(temp);
        sc.close();
    }
}
