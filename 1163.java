import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        result += n1;
        result += n2;
        String str = result+"";
        int i = 0;
        //문자열 길이 - 백의 자릿수 = index값
        if(str.length() == 3){
            i = str.length()-3;
        }
        else if(str.length() == 4){
            i = str.length()-3;
        }
        else if(str.length() == 5){
            i = str.length()-3;
        }
        int n = str.charAt(i)-'0';
        if(n % 2 == 0){
            System.out.println("대박");
        }
        else{
            System.out.println("그럭저럭");
        }
    }
}
