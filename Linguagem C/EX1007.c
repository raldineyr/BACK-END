#include <stdio.h>

void grafico(int contador);

int main()
{
    int valor;

    valor = 2;

    while(valor <= 64)
    {
        grafico(64);
        printf("O valor e %d\n", valor);
        valor = valor * 2;
    }
    return(0);
}
void grafico(int contador)
{
    int x;

    for(x=0; x < contador; x = x + 1 )
        putchar('*');
    putchar('\n');
}
