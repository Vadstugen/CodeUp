import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 13){//2000
            n = 13 - n;
            System.out.println(n+" 3");
        }
        else{
            n -= 13;
            n = 100 - n;
            System.out.println(n+" 1");
        }
    }
}
