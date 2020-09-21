#include <stdio.h>
int main(){
    int n1, n2, n3;
    double c1, c2, c3;
    scanf("%lf %d", &c1, &n1);
    scanf("%lf %d", &c2, &n2);
    scanf("%lf %d", &c3, &n3);
    printf("%.1lf", (double)(c1 * n1) + (c2 * n2) + (c3 * n3));
}
