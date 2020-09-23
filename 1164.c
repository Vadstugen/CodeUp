#include <stdio.h>
int main(){
    int n1, n2, n3;
    scanf("%d %d %d", &n1, &n2, &n3);
    if(n1 <= 170 || n2 <= 170 || n3 <= 170){
        printf("CRASH");
    }
    else
    printf("PASS");
    return 0;
}
