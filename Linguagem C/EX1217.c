#include <stdio.h>

int main()
{
    char jdavelha[3][3];
    int x, y;

    for (x = 0; x < 3; x++)
        for (y = 0; y < 3; y++)
        jdavelha[x][y]='.';
    jdavelha[1][1]= 'x';

    puts("Preparado para o jogo da velha?");

    for(x = 0; x < 3; x++)
    {
       for(y = 0; y < 3; y++)
            printf("%c\t",jdavelha[x][y]);
       putchar('\n');
    }
    return (0);
}
