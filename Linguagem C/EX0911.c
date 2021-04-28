#include <stdio.h>

int main()
{
    int alfabeto, numero;

    for (alfabeto = 'A'; alfabeto <= 'G'; alfabeto = alfabeto + 1)
    {
        for (numero = 1; numero <= 7; numero = numero + 1)
        {
            printf("%c%d\t",alfabeto,numero);
        }
        putchar('\n');
    }
    return (0);
}
