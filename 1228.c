#include <stdio.h>
int main(){
	double k, m;
	scanf("%lf %lf", &k, &m);//키 몸무게 입력
	double Fm = (k-100)*0.9;//표준 몸무게
	//비만도
	double bm = (m-Fm) * 100 / Fm;
	if(bm <= 10){
		printf("정상");
	} else if(bm>10 && bm <= 20){
		printf("과체중");
	} else{
		printf("비만");
	}
}
