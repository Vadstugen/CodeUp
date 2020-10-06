#include <stdio.h>

long long int n;



long long int abs(long long int k){
    if(k < 0){
        return (k * -1);
    }
    else{
        return k;
    }
}
int main()
{
  scanf("%lld", &n);
  printf("%lld\n", abs(n));
  return 0;
}
