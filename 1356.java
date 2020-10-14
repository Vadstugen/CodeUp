import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){//4행 반복
            if(i == 0 || i == n-1){//1, n-1 모두 채우기
                for(int j=0; j<n; j++){
                    System.out.print("*");
                }
            }
            else{//속 비우기
                System.out.print("*");//1 출력
                for(int j=0; j<n-2; j++){//양옆 2뺀만큼 반복
                    System.out.print(" ");//n-1출력
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
