import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {400, 340, 170, 100, 70};
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(arr[n1-1]+arr[n2-1] > 500){
            System.out.println("angry");
        }else{
            System.out.println("no angry");
        }
    }
}
