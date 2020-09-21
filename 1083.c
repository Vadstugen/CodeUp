#include <stdio.h>
int main(){
	int num;
	scanf("%d", &num);
	for(int i=1; i<=num; i++){
		if(i == 3)
		printf("X ");
		else if(i == 6)
		printf("X ");
		else if(i == 9)
		printf("X ");
		else
		printf("%d ", i);
	}
	return 0;
}
