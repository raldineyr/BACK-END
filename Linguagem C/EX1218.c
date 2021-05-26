#include <stdio.h>
#define TAMANHO 3

int main()
{
    char presidente[TAMANHO][8] = {"Clinton","Bush","Obama"};
    int x, indice;

    for(x = 0; x < TAMANHO; x++)
    {
        indice = 0;
        while (presidente[x][indice] != '\0')
        {
            putchar(presidente[x][indice]);
            indice++;
        }
        putchar('\n');
    }
    return 0;
}
