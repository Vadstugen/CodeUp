#include <stdio.h>

int n, d[110];


int f(){
    int max = 0;
    int idx = 0;
    for(int i=0; i<n; i++){
        if(d[i] > max){
            max = d[i];
            idx = i;
        }
    }
    return idx+1;
}
int main()
{
  scanf("%d", &n);

  for(int i=0; i<n; i++)
    scanf("%d", &d[i]);

  printf("%d", f());
  return 0;
}
