#include <stdio.h>
#define SECRETO 12

int main()
{
    int numero;

    printf("Voce consegue adivinhar o numero secreto?\nInforme o numero secreto: ");
            scanf("%d",&numero);

            if(numero == SECRETO)
            {
                printf("Voce adivinhou!\n%d e o numero secreto!",numero);
            }
            if (numero != SECRETO)
            {
                printf("ERRADO!");
            }
    return(0);
}
