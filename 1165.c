#include <stdio.h>
int main(){
    int t, g;
    scanf("%d %d", &t, &g);//경기 시간과 골 입력
    while(1){
        if(t < 90){
            g++;
            t+=5;
        }
        else{
            printf("%d", g);//골 개수 출력
            return 0;
        }
    }
}
