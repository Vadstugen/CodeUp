#include <stdio.h>

int n;



int zero(int n){
    if(n == 0){
        return !n;//0의 반대 1반환
    }
    else{
        return !n;//1의 반대 0반환
    }
}
int main()
{
  scanf("%d", &n);
  if(zero(n)) printf("zero");
  else printf("non zero");
  return 0;
}
