#include <stdio.h>

double x;


double f(double x) {
	int num = x;
	return x - num;
}
int main()
{
  scanf("%lf", &x);
  printf("%.14lf\n", f(x));
}
