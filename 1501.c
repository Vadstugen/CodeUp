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
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}
