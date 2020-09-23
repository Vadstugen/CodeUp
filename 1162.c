#include <stdio.h>
#include <string.h>
int main(){
    int y, m, d;
    char arr[10];
    int len, result;
    scanf("%d %d %d", &y, &m, &d);
    result = ((y - m) + d);//년도 - 월 + 날짜
    sprintf(arr, "%d", result);
    len = strlen(arr);//배열 크기 반환
    if(arr[len-1] == '0'){
        printf("대박");
        return 0;
    }
    else
    printf("그럭저럭");
}
