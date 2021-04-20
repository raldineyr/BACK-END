#include <stdio.h>

int main()
{
    int c;
    printf("Eu estou esperando por um caracter: ");
    c = getchar();
    printf("Eu esperei pelo caracter '%c'.\n",c);
    return(0);
}
