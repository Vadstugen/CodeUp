import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = 30;
        if(m - n >= 0){
            m -= n;
            System.out.println(h+" "+m);
        }
        else{
            n -= m;
            m = 60;
            m -= n;
            if(h == 0){
                h = 23;
            }
            else
            h--;
            System.out.println(h+" "+m);
        }
    }
}
