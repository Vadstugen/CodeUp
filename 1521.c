#include <stdio.h>
int main(){
	int k, n;
	scanf("%d %d", &k, &n);
	int arr[k][k];
	int cnt = 0;
	for(int i=0; i<k; i++){
		for(int j=0; j<k; j++){
			scanf("%d", &arr[i][j]);
			if(arr[i][j] != -1){//인삼 존재 
				for(int l=0; l<n; l++){
				arr[i][j]++;
				}
				if(arr[i][j] >= 0 && arr[i][j] <= 5){
					cnt++;//가리개 필요! 
				}
			}
		}
	}
	printf("%d", cnt);
}
