import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        String str = "";
        if(c / 10 == 0){//몫이 0이면 1의자릿수
            System.out.println(a+""+b+"0"+c+"");
        }
        else{
            System.out.println(a+""+b+""+c+"");
        }
    }
}
