#include <stdio.h>
int main(){
	char ch;
	char ch2 = 97;
	scanf("%c", &ch);
	
	while(1){
		if(ch2 == ch){
			printf("%c", ch2);
			break;
		}
		else
		printf("%c ", ch2);
		ch2++;
	}
	
	
	
	return 0;
}
