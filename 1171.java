import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        String str = a+"";
        if(b / 10 == 0){//1의 자리면
            str += "0"+b+"";
        }
        else{
            str += b+"";
        }
        
        if(c / 10 == 0){//1의 자리
            str += "00"+c+"";
        }
        else if(c / 100 == 0){//10의 자리
            str += "0"+c+"";
        }
        else if(c / 1000 == 0){//100의 자리
            str += c+"";
        }
        System.out.println(str);
    }
}
