import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mid = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0]+" ");
        if(n % 2 == 0){//짝수면
            mid = (n / 2)-1;
        }
        else if(n % 2 != 0){
            mid = ((n+1) / 2)-1;
        }
        System.out.print(arr[mid]+" ");
        System.out.print(arr[n-1]);
    }
}
