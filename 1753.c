#include <stdio.h>
#include <string.h>
typedef struct {
	char str[100];
	int len;
}st;
int main() {
	st starr[100];
	char cpy_str[100];
	int n;
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf_s("%s", starr[i].str, 100);
		starr[i].len = strlen(starr[i].str);
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < starr[i].len; j++) {
			cpy_str[j] = starr[i].str[starr[i].len - j - 1];
			printf("%c", cpy_str[j]);
		}
		printf("\n");
	}
}
