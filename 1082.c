#include <stdio.h>
int main(){
	int num;
	scanf("%x", &num);//16진수 입력
	for(int i=1; i<16; i++){
		printf("%X*%X=%X\n", num, i, i*num);
	}
	return 0;
}
