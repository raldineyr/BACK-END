#include <stdio.h>
#include <stdlib.h>

int main()

{
    unsigned semente;
    int r, a, b;

    printf("Informe uma semente de numero aleatorio: ");
    scanf("%u",&semente);

    srand(semente);
    srand(semente);
    for (a = 0; a < 20; a++)
    {
        for (b = 0; b < 5; b++)
        {
            r = rand();
            printf("%d\t",r);
        }
        putchar('\n');
    }
    return 0;
}
