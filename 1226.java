import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rnum = new int[7];
        for(int i=0; i<7; i++){
            rnum[i] = sc.nextInt();
        }
        int [] mynum = new int[6];
        for(int i=0; i<6; i++){
            mynum[i] = sc.nextInt();
        }
        int cnt = 0;
        int ck = 0;
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(mynum[i] == rnum[j]){
                    cnt++;
                }
            }
        }
        if(cnt == 5){
            for(int i=0; i<6; i++){
                if(mynum[i] == rnum[6]){
                    ck = 1;
                }
            }
        }
        if(cnt == 3){
            System.out.println("5");
        }else if(cnt == 4){
            System.out.println("4");
        }else if(cnt == 5 && ck == 1){
            System.out.println("2");
        } else if(cnt == 5){
            System.out.println("3");
        } else if(cnt == 6){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
