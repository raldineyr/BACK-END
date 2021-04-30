#include <stdio.h>

int main()
{
    int contador;
    contador = 0;
    while (1)
    {
        printf("%d, ", contador);
        contador = contador + 1;
        if (contador > 50)
            break;
    }
    putchar('\n');
    return (0);
}
