#include <stdio.h>
#include <string.h>
int main(){
    char str[1000];
    scanf("%[^\n]s", str);
    printf("%d\n", strlen(str));
}
