import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = (n % 10)+"";
        str += (n / 10)+"";
        n = Integer.parseInt(str)*2;
        if(n >= 100){
            n %= 100;
        }
        if(n > 50){
            System.out.println(n);
            System.out.println("OH MY GOD");
        }
        else{
            System.out.println(n);
            System.out.println("GOOD");
        }
    }
}
