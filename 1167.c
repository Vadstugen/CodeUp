#include <stdio.h>
int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    int sum = a + b + c;
    int max = 0;
    int min = 10000;
    if(a > max){
        max = a;
    }
    if(b > max){
        max = b;
    }
    if(c > max){
        max = c;
    }
    if(a < min){
        min = a;
    }
    if(b < min){
        min = b;
    }
    if(c < min){
        min = c;
    }
    sum = sum - max - min;
    if(sum == a){
        printf("%d", a);
    }
    else if(sum == b){
        printf("%d", b);
    }
    else{
        printf("%d", c);
    }
}
