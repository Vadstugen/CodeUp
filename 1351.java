import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=n1; i<=n2; i++){
            for(int j=1; j<10; j++){
                System.out.printf("%d*%d=%d\n",i, j, i*j);
            }
        }
    }
}
