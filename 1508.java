import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){//첫 행 입력
            arr[i][0] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){//열 이동
            for(int j=0; j<n-1; j++){
                arr[j+1][i+1] = arr[j+1][i] - arr[j][i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
