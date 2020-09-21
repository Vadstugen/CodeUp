#include <stdio.h>
int main(){
	int arr[11][11]={};
	for(int i=1;i<11;i++){
        for(int j=1;j<11;j++){
            scanf("%d",&arr[i][j]);
        }
    }
	int a = 2;
	int b = 2;
	
	while(1){
		
		if(arr[a][b] == 2){//시작점이 2면 9로 초기화 후  정지 
			arr[a][b] = 9;
			break;
		}
		
		else
		arr[a][b] = 9;//2가 아니라면 9로 초기화
		
		if(arr[a][b+1] == 0){//오른쪽이 0이면 이동
			b++;//오른쪽 이동
			arr[a][b] = 9; 
		}
		
		else if(arr[a][b+1] == 1){
			if(arr[a+1][b] == 1)
			{
				break;
			}
			a++;
			if(arr[a][b] == 2){
				 arr[a][b] = 9;
				break;
			}
			if(arr[a][b] == 2){
				break;
			}
			arr[a][b] = 9;
		}
		else if(arr[a][b+1] == 2){
			b++;
			arr[a][b] = 9;
			break;
		}
		
		else{
			arr[a][b] = 9;
			break;
		}
	}
	
	for(int j=1; j<11; j++){
		for(int i=1; i<11; i++){
			printf("%d ", arr[j][i]);
		}
		printf("\n");
	}
}
