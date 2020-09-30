import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = n;
        for(int i=1; i<k; i++){
            num *= n;
        }
        if(k == 0){//0승이면
            num = 1;
        }
        System.out.println(num);
    }
}
