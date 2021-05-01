#include <stdio.h>

void grafico (int contador, char caractere);

int main()
{
    int valor;

    valor = 2;

    while (valor <= 64)
    {
        grafico(valor,'=');
        printf("Valor e %d\n",valor);
        valor = valor * 2;
    }
    return(0);
}

void grafico (int contador, char caractere)
{
    int x;

    for (x = 0; x < contador; x = x + 1)
        putchar(caractere);
    putchar('\n');
}
