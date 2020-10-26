#include <stdio.h>
int main(){
    int max = 0;
    int min = 1000;
    int n;
    scanf("%d", &n);
    max = n;
    min = n;
    for(int i=0; i<4; i++){
        scanf("%d", &n);
        if(n > max){
            max = n;
        }
        else if(n < min){
            min = n;
        }
    }
    printf("%d\n", max);
    printf("%d", min);
}
