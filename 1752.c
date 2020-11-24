#include <stdio.h>
#include <string.h>
int main() {
	char str[20];
	char cpy_str[20];
	scanf("%s", str);
	int len = strlen(str);
	for (int i = 0; i < len; i++) {
		cpy_str[i] = str[len-i-1];
		printf("%c", cpy_str[i]);
	}
}
