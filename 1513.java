import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int ck = 1; // 1: 홀     2: 짝
        int num = 1;
        int sub;
        for (int i=0; i<n; i++){
            if(ck == 1){
                for(int j=0; j<n-i; j++){
                    arr[n-j-1][j+i] = num++;
                }
                ck = 2;
            }
            else if(ck == 2){
                sub = i;
                for(int j=n-1; j>=i; j--){
                    arr[sub][j] = num++;
                    sub++;
                }
                ck = 1;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
