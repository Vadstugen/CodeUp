import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("*");
        }
        else{
            for(int i=1; i<=n; i++){//행 반복
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n-1; i>0; i--){
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}