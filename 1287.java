import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        if(n >= 1 && n <= 9){
            for(int i=1; i<10; i++){
                num = n * i;
                for(int j=1; j<= num; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
