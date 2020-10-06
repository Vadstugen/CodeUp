#include <stdio.h>

int n;



int prime(int a){
    int cnt = 0;
    for(int i=1; i<=a; i++){
        if(a % i == 0){
            cnt++;
        }
    }
    if(cnt == 2){
        return 1;
    }
    else if(cnt != 2){
        return 0;
    }
}
int main()
{
  scanf("%d", &n);
  if(prime(n)) printf("prime");
  else printf("composite");
  return 0;
}
