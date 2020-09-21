#include <stdio.h>
int main(){
    char c;
    int cnum;
    char h;
    int hnum;
    int result;
    scanf("%c%d%c%d", &c, &cnum, &h, &hnum);
    result = (cnum * 12) + (hnum * 1);
    printf("%d", result);
}
