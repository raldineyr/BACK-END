#include <stdio.h>

int main()

{
    int c;

    printf("Estou esperando um caracter: ");

    c = getc(stdin);
    printf("O caracter que eu esperei foi: '%c'",c);

    return (0);
}
