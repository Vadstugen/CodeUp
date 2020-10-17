import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(n+"st");
        }
        else if(n == 2){
            System.out.println(n+"nd");
        }
        else if(n == 3){
            System.out.println(n+"rd");
        }
        else if(n > 3 && n <= 19){
            System.out.println(n+"th");
        }
        else if(n%10 == 0){
            System.out.println(n+"th");
        }
        else if(n%10 == 1){
            System.out.println(n+"st");
        }
        else if(n%10 == 2){
            System.out.println(n+"nd");
        }
        else if(n%10 == 3){
            System.out.println(n+"rd");
        }
        else{
            System.out.println(n+"th");
        }
    }
}
