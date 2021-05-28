#include <stdio.h>
#define TAMANHO 5

void mostrararray (int array[]);

int main()
{
        int n[] = { 1, 2, 3, 5, 7};
        puts("Aqui o seu array:");
        mostrararray(n);
    return (0);
}

void mostrararray (int array[])
{
    int x;

    for (x = 0; x < TAMANHO; x++)
        printf("%d\t",array[x]);
    putchar('\n');
}
