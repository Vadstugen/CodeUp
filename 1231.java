import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n1, n2;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '+'){
                n1 = Integer.parseInt(str.substring(0, i));
                n2 = Integer.parseInt(str.substring(i+1));
                System.out.println(n1+n2);
                break;
            }
            else if(str.charAt(i) == '-'){
                n1 = Integer.parseInt(str.substring(0, i));
                n2 = Integer.parseInt(str.substring(i+1));
                System.out.println(n1-n2);
                break;
            }
            else if(str.charAt(i) == '*'){
                n1 = Integer.parseInt(str.substring(0, i));
                n2 = Integer.parseInt(str.substring(i+1));
                System.out.println(n1*n2);
                break;
            }
            else if(str.charAt(i) == '/'){
                n1 = Integer.parseInt(str.substring(0, i));
                n2 = Integer.parseInt(str.substring(i+1));
                System.out.printf("%.2f", (double)n1/n2);
                break;
            }
        }
    }
}
