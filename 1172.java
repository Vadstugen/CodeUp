import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        for(int i=0; i<arr.length; i++){//n-1번 반복
            for(int j=0; j<arr.length-1-i; j++){//n < n+1 비교
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<3; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
