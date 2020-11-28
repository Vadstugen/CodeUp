#include <stdio.h>
int main(){
    int n;
    int num = 1;
    scanf("%d", &n);
    int arr[n][n];
    for(int i=0; i<n; i++){
        if(i % 2 == 0){
            for(int j=0; j<n; j++)
                arr[j][i] = num++;
        }
        if(i % 2 == 1){
            for(int j=n-1; j>=0; j--){
                arr[j][i] = num++;
            }
        }
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}
