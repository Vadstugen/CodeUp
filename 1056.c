#include <stdio.h>
int main(){
	int a, b;
	scanf("%d %d", &a, &b);
	printf("%d", (!a&&b) || (a&&!b));
	// 1 0 == 0 1 = 1
	// 0 1 == 1 1 = 1
}
