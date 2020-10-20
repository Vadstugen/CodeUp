import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1 > n2 - n3){
            System.out.println("do not advertise");
        }
        else if(n1 < n2 - n3){
            System.out.println("advertise");
        }
        else{
            System.out.println("does not matter");
        }
    }
}
