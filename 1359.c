#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    for(int i=1; i<=n; i++){
        int num = 1;
        for(int j=0; j<i; j++){
            printf("%d ",num++);
        }
        printf("\n");
    }
}
