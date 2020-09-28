#include <stdio.h>
int main(){
    int a, b;
    scanf("%d %d", &a, &b);
    if(b % a == 0){//b가 a에 배수면
        for(int i=0; i<b; i++){
            if(a * i == b){
                printf("%d*%d=%d",a,i,a*i);
                break;
            }
        }
    }
    else if(a % b == 0){//a가 b에 배수면
        for(int i=0; i<a; i++){
            if(b * i == a){
                printf("%d*%d=%d",b,i,b*i);
                break;
            }
        }
    }
    else{
        printf("none");
    }
}
