import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0;
        String str = "";
        if(a % 2 == 0){//짝수면
            n -= a;
            str+="-"+a;
        }
        else if(a % 2 != 0){//홀수면
            n += a;
            str+=a+"";
        }
        for(int i=a+1; i<=b; i++){
            if(i % 2 == 0){//짝수면
                n -= i;
                str+="-"+i;
            }
            else if(i % 2 != 0){//홀수면
                n += i;
                str+="+"+i;
            }
        }
        str += "=";
        System.out.println(str+n);
    }
}
