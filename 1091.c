#include <stdio.h>
int main(){
	int a, m, d, n;
	scanf("%d %d %d %d", &a, &m, &d, &n);
	long long sum = a;
	for(int cnt=1; cnt<n; cnt++){
		sum = sum * m;
		sum = sum + d;
	}
	printf("%lld", sum);
	return 0;
}
