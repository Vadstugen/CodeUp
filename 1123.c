#include <stdio.h>
int main(){
    int num;
    double result;
    scanf("%d", &num);
    result = (double)9 / 5 * num + 32;
    printf("%.3lf",  (double)result);
}
