#include <stdio.h>
int main() {
	double a, b;
	scanf("%lf %lf", &a, &b);
	int result = a / b;
	printf("%.1f\n", a / b);
	printf("%d\n", result);
	result = 1;
	for (int i = 0; i < b; i++) {
		result *= a;
	}
	printf("%d", result);
}
