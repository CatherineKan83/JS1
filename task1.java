import java.util.Scanner;

public class task1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = input.nextInt();
        int pr = 1;
        int sum = 0;
        int[]arr = new int[n+1];
        for(int i=1; i<arr.length; ++i){
            arr[i]=i;   pr = pr*arr[i];   sum = sum +arr[i];
        }
        System.out.print("Product = " + pr + "\nTriangular number = " + sum);
        input.close();
    }
}
