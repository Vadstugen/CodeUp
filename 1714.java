import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr =new char[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
