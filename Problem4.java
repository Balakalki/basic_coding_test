
import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        ArrayList<Integer> input = new ArrayList<>();

        System.out.println("Enter all input numbers");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            input.add(sc.nextInt());
        }

        arr[0] = n;
        for(int i = 2; i <= arr.length; i ++){
            for(int a : input){
                if( a % i == 0){
                    arr[i - 1] ++;
                }
            }
        }
        System.out.print("{");
        int i = 0;
        for(; i < arr.length - 1; i++){
            System.out.print((i + 1) + ": " + arr[i] + ", ");
        }
        System.out.println((i + 1) + ": " + arr[i] + "}");
        sc.close();
    }
}
