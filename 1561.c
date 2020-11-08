#include <stdio.h>

int n, m;
int max(int n1, int n2){
    return n1>n2? n1 : n2;
}
int main()
{
  scanf("%d%d", &n, &m);
  printf("%d\n", max(n, m));
}
