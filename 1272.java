import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int h = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        int[] arr = new int[100000];
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0 || i == 0){
                arr[i] = ++num1;
            } else if(i % 2 != 0){
                arr[i] = (num2+=10);
            }
        }
        System.out.println(arr[k-1]+arr[h-1]);
    }
}
