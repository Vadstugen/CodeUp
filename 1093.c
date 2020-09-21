#include <stdio.h>
int main(){
	int n = 0;
	int t = 0;
	scanf("%d", &n);
	int arr[10001]={};
	for(int i=0; i<n; i++){
		scanf("%d", &t);
		arr[t-1]+=1;
	}
	for(int i=0; i<23; i++){
		printf("%d ", arr[i]);
	}
	return 0;
}
