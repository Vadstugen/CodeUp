#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    int arr[n][n];
    int cnt = 1;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            arr[i][j] = cnt;
            cnt++;
        }
    }
    for(int i=0; i<n; i++){
        if(i % 2 != 0){//홀수인 경우(역 방향으로 출력)
            for(int j=n-1; j>=0; j--){
                printf("%d ", arr[i][j]);
            }
        }
        else if(i % 2 == 0){
            for(int j=0; j<n; j++){
                printf("%d ", arr[i][j]);
            }
        }
        printf("\n");
    }
}
