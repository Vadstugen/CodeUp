import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0;
        for(int i=a; i<=b; i++){
            if(i % 2 == 0){//짝수면
                n -= i;
            }
            else if(i % 2 != 0){//홀수면
                n += i;
            }
        }
        System.out.println(n);
    }
}
