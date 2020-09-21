#include <stdio.h>
int main(){
    int y, m, d, num2;
    scanf("%2d%2d%2d-%d",&y,&m,&d, &num2);
    printf("%02d%02d%02d%d", y, m, d, num2);
}
