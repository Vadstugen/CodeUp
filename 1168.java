import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String result = "";
        if(n == 1 || n == 2){//1900년대
            result = "19";
            result += str.substring(0,2);//0~1추출
        }
        else if(n == 3 || n == 4){//2000년대
            result = "20";
            result += str.substring(0,2);//0~1추출
        }
        System.out.println((2012-Integer.parseInt(result))+1);
    }
}
