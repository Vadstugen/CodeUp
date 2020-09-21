#include <stdio.h>
int main(){
    int num1, num2, num3;
    scanf("%d %d %d",&num1, &num2, &num3);
    printf("%lld\n", (long long)num1+num2+num3);
    printf("%.1f", (float)(num1+num2+num3) / 3);
}
