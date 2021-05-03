#include <stdio.h>
#define VALOR 3

int main()
{
    int a;

    printf("Modulo %d:\n", VALOR);
    for (a = 0; a < 30; a++)
    printf("%d %% %d = %d\n", a, VALOR, a%VALOR);
    return 0;
}
