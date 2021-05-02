#include <stdio.h>

int main()
{
    int a, b;

    b = 16;

    printf("Antes, \"a\" não esta atribuido e \"b\"\n",b);
    a=++b++;

    printf("Depois, a=%d e b=%d\n", a, b);
    return (0);
}

//"Deixe para lá a coisa ++var++ é um erro" - Dan Gookin
