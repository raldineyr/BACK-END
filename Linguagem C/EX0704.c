#include <stdio.h>

int main()
{
    int a, b, c;

    printf("Eu estou esperando por tres caracteres: ");

    a = getc(stdin);
    b = getc(stdin);
    c = getc(stdin);

    printf("Os caracteres que eu esperei sao: %c, %c, %c.", a, b, c);

    return 0;
}
