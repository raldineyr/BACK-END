#include <stdio.h>

int main()
{
    char sentenca[] = "Texto aleatorio.";
    int indice;

    indice = 0;
    while (sentenca[indice] != '\0')
    {
        putchar(sentenca[indice]);
        indice++;
    }
    putchar('\n');
    return(0);
}
