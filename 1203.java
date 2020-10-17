import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 10){
            System.out.println("정상");
        }
        else if(n <= 20){
            System.out.println("과체중");
        }
        else if(n > 20){
            System.out.println("비만");
        }
    }
}
