import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(i % 3 == 0 && i % 4 == 0){
                continue;
            } else if(i % 3 == 0){
                sum+=i;
            } else if(i % 4 == 0){
                sum-=i;
            }
        }
        System.out.println(sum);
    }
}
