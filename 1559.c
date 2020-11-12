#include <stdio.h>

int n, m;


long long int f(int n1, int n2){
    return (long long int)n1 + n2;
}
int main()
{
  scanf("%d%d", &n, &m);
  printf("%lld\n", f(n, m));
}
