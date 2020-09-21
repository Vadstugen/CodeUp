#include <stdio.h>
int main(){
	int a, d, n;
	scanf("%d %d %d", &a, &d, &n);
	unsigned long long sum = a;
	for(int cnt=1; cnt<n; cnt++){
		sum *= d;
	}
	printf("%lld", sum);
	return 0;
}
