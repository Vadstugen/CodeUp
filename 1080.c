#include <stdio.h>
int main(){
	int num;
	int sum = 0;
	int i = 0;
	scanf("%d", &num);
	
	while(1){
		i++;
		sum+=i;
		
		if(sum >= num){
			printf("%d", i);
			break;
		}
		
	}
}
