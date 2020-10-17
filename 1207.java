import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt++;
            }
        }
        if(cnt == 1){
            System.out.println("도");
        }
        else if(cnt == 2){
            System.out.println("개");
        }
        else if(cnt == 3){
            System.out.println("걸");
        }else if(cnt == 4){
            System.out.println("윷");
        }
        else if(cnt == 0){
            System.out.println("모");
        }
    }
}
