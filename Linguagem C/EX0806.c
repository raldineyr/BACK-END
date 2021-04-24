#include <stdio.h>
#define SECRETO 11
int main()
{
    int numero;

    printf("Voce consegue adivinhar o numero secreto\nInforme o numero secreto: ");
    scanf("%d",&numero);

    if(numero == SECRETO)
    {
        printf("Voce adivinhou!");
        return (0);
    }

    if(numero != SECRETO)
    {
        printf("ERRADO!");
        return(1);
    }
    return(0);
}
