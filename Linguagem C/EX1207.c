#include <stdio.h>
#include <math.h>

int main()
{
    int valores[]={10,12,14,15,16,18,20};
    float contagem[7];
    int x;

        for (x = 0; x < 7; x++)
            contagem[x] = sqrt(valores[x]);

        for (x = 0; x < 7; x++)
            printf("A raiz quadrada de %d e: %.2f\n",valores[x],contagem[x]);

    return 0;
}
