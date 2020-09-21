#include <stdio.h>
int main(){
	char num;
	
	while(1){
		scanf("%c", &num);
		if(num == 113){
			printf("%c", num);
			break;
		}
		printf("%c", num);
	}
}
