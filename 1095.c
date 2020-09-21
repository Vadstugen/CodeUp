#include <stdio.h>
int main(){
	int n;
	int num;
	int min=10000;
	scanf("%d", &n);
	for(int i=0; i<n; i++){
		scanf("%d", &num);
		if(num < min){
			min = num;
		}
	}
	printf("%d", min);
}
