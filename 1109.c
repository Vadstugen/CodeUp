#include <stdio.h>
int main() {
    char name[20];
    int age;
    char ch;
    double prinum;
    scanf("%s", &name);
    getchar();
    scanf("%d", &age);
    getchar();
    scanf("%c", &ch);
    getchar();
    scanf("%lf", &prinum);
    getchar();

    printf("%s\n", name);
    printf("%d\n", age);
    printf("%c\n", ch);
    printf("%g\n", prinum);
}
