#include <stdio.h>
int main(){
	double k, m;
	scanf("%lf %lf", &k, &m);//키 몸무게 입력
	double fm;//표준 몸무게 
	if(k < 150){
		fm = k-100;
	} else if(k >= 150 && k < 160){
		fm = (k-150)/2+50;
	} else if(k >= 160){
		fm = (k-100)*0.9;
	}
	double bm = (m-fm)*100/fm;
	if(bm <= 10){
		printf("정상");
	} else if(bm > 10 && bm <= 20){
		printf("과체중");
	} else{
		printf("비만");
	}
}
