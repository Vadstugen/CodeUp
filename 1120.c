#define day 24
#include <stdio.h>
int main(){
    int n1, n2, n3;
    scanf("%d %d %d", &n1, &n2, &n3);
    printf("%.2lf", (double)(n1 + n2 + n3) / 3);
}
