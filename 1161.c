#include <stdio.h>
int main(){
    int a, b, result;
    scanf("%d %d", &a, &b);
    if(a % 2 == 0){
        printf("짝수+");
    }
    else
    printf("홀수+");
    
    if(b % 2 == 0){
        printf("짝수=");
    }
    else
    printf("홀수=");
    result = a + b;
    if(result % 2 == 0){
        printf("짝수");
    }
    else
    printf("홀수");
}
