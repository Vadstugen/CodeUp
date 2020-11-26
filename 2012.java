import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a; i<=b; i++){
            String str = i+"";
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '1'){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
