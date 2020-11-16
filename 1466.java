import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//행
        int m = sc.nextInt();//열
        int num = 1;
        int[][] arr = new int[n][m];
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                arr[j][i] = num++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
