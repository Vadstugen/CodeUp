#include <stdio.h>
int main(){
	int a, b;
	scanf("%d", &a);
reload:
	if(a-- != 0){
		scanf("%d", &b);
		printf("%d\n", b);
		goto reload;
	}
	else
	return 0;
}
