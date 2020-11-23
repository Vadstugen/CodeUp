#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    int result;
    scanf("%d", &result);
    for(int i=0; i<n; i++){
        if(arr[i] == result){
            printf("%d", i+1);
            break;
        }
        if(i == n-1){
            printf("-1");
        }
    }
}
