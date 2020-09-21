#include <stdio.h>
int main(){
	int n = 0;
	int arr[20][20] = {};
	
	for(int i=0; i<19; i++){
		for(int j=0; j<19; j++){
			scanf("%d", &arr[i][j]);
		}
	}
	
	scanf("%d", &n);//좌표 개수
	int x, y;
	for(int k=0; k<n; k++){
		scanf("%d %d",&x, &y);//좌표 입력 
		for(int i=0; i<19; i++){
			if(arr[x-1][i] == 1){//가로먼저 
				arr[x-1][i] = 0;
			}
			else
			arr[x-1][i] = 1;//0이면 1으로 
		}
		
		for(int i=0; i<19; i++){
			if(arr[i][y-1] == 1){//가로먼저 
				arr[i][y-1] = 0;
			}
			else
			arr[i][y-1] = 1;//0이면 1으로 
		}	
	}
	for(int i=0; i<19; i++){
		for(int j=0; j<19; j++){
			printf("%d ",arr[i][j]);
		}
		printf("\n");
	}
	
}
