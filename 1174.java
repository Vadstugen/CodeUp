import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        h+=24;
        m = (h*60)+m;//분 합계
        m -= 30;//30분전
        h = m/60;
        h = h%24;
        m = m%60;
        System.out.println(h+" "+m);
    }
}
