#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    int num = n;
    for(int i=0; i<n; i++){
        for(int j=0; j<n-i; j++){
            printf("%d ", num);
        }
        printf("\n");
        num--;
    }
}
