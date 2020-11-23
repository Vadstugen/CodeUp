#include <stdio.h>
int main(){
	int t;
	scanf("%d", &t);
	int s = t%60;
	t/=60;
	int m = t%60;
	t/=60;
	int h = t%24;
	t/=24;
	printf("%d %d %d %d", t ,h, m, s);
}
