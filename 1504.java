import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            if((i+1) % 2 == 1){
                for(int j=0; j<n; j++){
                    arr[j][i]=a++;
                }
            }
            else if((i+1) % 2 != 1){
                for(int j=n-1; j>=0; j--){
                    arr[j][i]=a++;
                }
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
