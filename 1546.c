#include <stdio.h>

int n;



int zero(int n){
    if(n == 0){
        return 1;
    }
    else{
        return 0;
    }
}

int plus(int n){
    if(n > 0){
        return 1;
    }
    else if(n < 0){
        return 0;
    }
}
int main()
{
  scanf("%d", &n);
  if(zero(n)) printf("zero");
  else printf("%s", plus(n)?"plus":"minus");
  return 0;
}
