#include <stdio.h>
int main(){
    int n1, n2;
    int max = 0;
    for(int i=0; i<3; i++){
        scanf("%d %d", &n1, &n2);
        if(n1 * n2 > max){
            max = n1 * n2;
        }
    }
    printf("%d", max);
}
