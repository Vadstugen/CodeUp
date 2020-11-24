#include <stdio.h>
#include <string.h>
int main() {
	char str1[100];
	char str2[100];
	scanf_s("%s", str1, 100);
	scanf_s("%s", str2, 100);
	int len1 = strlen(str1);
	int len2 = strlen(str2);
	if (len1 > len2) {
		printf("%s %s", str2, str1);
	}
	else if (len2 > len1) {
		printf("%s %s", str1, str2);
	}
	else {
		for (int i = 0; i < len1; i++) {
			if (str1[i] > str2[i]) {
				printf("%s %s", str2, str1);
				break;
			}
			else if (str2[i] > str1[i]) {
				printf("%s %s", str1, str2);
				break;
			}
		}
	}
}
