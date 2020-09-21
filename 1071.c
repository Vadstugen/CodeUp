#include <stdio.h>
int main(){
	int num;
reload:
	scanf("%d", &num);
	if(num == 0){
		goto end;
	}
	else
	printf("%d\n", num);
	
	goto reload;
end:
	return 0;
}
