import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] MAP = new int[10][10];
        int[] PL = new int[10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                MAP[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<10; i++){
            PL[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            if(PL[i] == 1){//말 존재
                for(int j=9; j>=0; j--) {
                    if(j == 0){ //도착
                        System.out.println(i+1+" safe");
                        break;
                    }
                    if (MAP[j][i] > 0) {//블럭 장애물
                        System.out.println(i+1+" crash");
                        break;
                    } else if (MAP[j][i] < 0) {//구덩이
                        System.out.println(i+1+" fall");
                        break;
                    }
                }
            }
        }
    }
}
