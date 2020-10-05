#include <stdio.h>

int n;



void f(){
    if(n == 0){
        printf("zero");
    }
    else{
        printf("non zero");
    }
}
int main()
{
  scanf("%d", &n);
  f(n);
  return 0;
}
