#include <stdio.h>
int main(){
	int h, w ,n, l, d, x, y;
	scanf("%d %d", &h, &w);//격자판의 가로 세로
	scanf("%d", &n); //막대의 개수
	int arr[100][100]={};//격자판 생성
	
	for(int k=1; k<=n; k++){//막대의 개수만큼 반복 
		scanf("%d %d %d %d", &l, &d, &x, &y);//길이, 방향, X, Y
		if(d == 1){
			for(int i=0; i<l; i++){
			arr[x+(i-1)][y-1] = 1;
			}
		}
		else{
			for(int i=0; i<l; i++){
			arr[x-1][y+(i-1)] = 1;
			}
		}
	}
	for(int q=0; q<h; q++){
		for(int r=0; r<w; r++){
			printf("%d ", arr[q][r]);
		}
		printf("\n");
	}
}
