import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        char[] pass = new char[10];
        String str = sc.nextLine();
        String phone = sc.nextLine();
        String result = "";
        for(int i=0; i<10; i++){
            pass[i] = str.charAt(i);
        }
        for(int i=0; i<phone.length(); i++){
            for(int j=0; j<10; j++){
                if(phone.charAt(i) == pass[j]){
                    result+=num[j];
                    break;
                }
                if(j==9){
                    result+=" ";
                }
            }
        }
        System.out.println(result);
    }
}
