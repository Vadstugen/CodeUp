#include <stdio.h>
int main(){
	int t;
	scanf("%d", &t);
	int s = t%60;
	t/=60;
	int m = t%60;
	t/=60;
	printf("%d %d %d", t, m, s);
}
