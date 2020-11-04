import java.util.Scanner;
/*
 1 2 3 4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int num = 1;
        int ck = 1;
        int h = 0;//행 index
        int y = 0;//열 index
        while (true){
            if(num == (n*n+1)){
                break;
            }
            if(ck == 1 || ck == 3){
                if(ck == 1){
                    for( ; y<n; y++){
                        if(arr[h][y] == 0){
                            arr[h][y] = num++;
                        } else{
                            break;
                        }
                    }
                    y--; h++;
                    ck = 2;
                    //->2
                } else if(ck == 3){
                    for(;y >= 0; y--){
                        if(arr[h][y] == 0){
                            arr[h][y] = num++;
                        } else{
                            break;
                        }
                    }
                    y++; h--;
                    ck = 4;
                    //->4
                }
            } else if(ck == 2 || ck == 4){
                if(ck == 2){
                    for( ;h<n; h++){
                        if(arr[h][y] == 0){
                            arr[h][y] = num++;
                        } else{
                            break;
                        }
                    }
                    h--; y--;
                    ck = 3;
                    //->3
                } else if(ck == 4){
                    for(; h>=0; h--){
                        if(arr[h][y] == 0){
                            arr[h][y] = num++;
                        } else{
                            break;
                        }
                    }
                    h++; y++;
                    ck = 1;
                    //->4
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
