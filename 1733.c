#include <stdio.h>
#include <string.h>

int main(){
    char str[10];
    scanf("%s", &str);
    int ck = strcmp(str, "IOI");
    if(ck == 0){
        printf("IOI is the International Olympiad in Informatics.");
    } else{
        printf("I don't care.");
    }
}
