#include <stdio.h>
int main(){
	int w, h, b, result;
	scanf("%d %d %d", &w, &h, &b);
	result = (w*h*b);
	double resultdap = (double)result / (8*1024*1024);
	printf("%.2lf MB", resultdap);
}
