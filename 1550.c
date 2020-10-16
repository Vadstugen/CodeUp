#include <stdio.h>

long long int n;


int sqrt(long long int n){
	if(n == 0){
		return 0;
	}
	for(long long int i=1; i<100000000; i++){
		if(i * i == n){
			return i;
		}
		if(i * i > n){
			return i-1;
		}
	}
}

int main()
{
  scanf("%lld", &n);
  printf("%d\n", sqrt(n));
  return 0;
}
