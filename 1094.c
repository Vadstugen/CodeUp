#include <stdio.h>
int main(){
	int n = 0;
	int t = 0;
	scanf("%d", &n);
	int arr[10001]={};
	for(int i=0; i<n; i++){
		scanf("%d", &arr[i]);
	}
	for(int i=n-1; i>=0; i--){
		printf("%d ", arr[i]);
	}
	return 0;
}
