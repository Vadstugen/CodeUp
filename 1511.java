import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = num++;
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++)
            sum += arr[0][i];
        for(int i=1; i<n; i++)
            sum += arr[i][n-1];
        for(int i=0; i<n-1; i++)
            sum += arr[n-1][i];
        for(int i=1; i<n-1; i++)
            sum += arr[i][0];
        System.out.println(sum);
    }
}
