import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        while (true){
            if(a <= b){
                System.out.printf("%.2f ", a);
                a += 0.01;
            }
            else{
                break;
            }
        }
    }
}
