#include <stdio.h>
int main(){
	int a, d, n;
	scanf("%d %d %d", &a, &d, &n);
	int sum = a;
	for(int cnt=1; cnt<n; cnt++){
		sum += d;
	}
	printf("%d", sum);
	return 0;
}
