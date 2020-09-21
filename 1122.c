#include <stdio.h>
int main(){
    int time;
    int mineit = 0;
    scanf("%d", &time);
    while(1){
        if(time >= 60){
            time -= 60;
            mineit++;
        }
        else{
            break;
        }
    }
    printf("%d %d", mineit, time);
}
