#include <stdio.h>

int main()
{
    int primeiro, segundo;

    printf("Digite o primeiro numero: ");
    scanf("%d",&primeiro);

    printf("Digite o segundo numero: ");
    scanf("%d",&segundo);

    if (primeiro > segundo)
    {
        printf("O numero %d e maior que o numero %d", primeiro, segundo);
    }
    else if(primeiro < segundo)
    {
        printf("O primeiro numero digitado e igual ao segundo numero digitado", primeiro, segundo);
    }
    else
    {
        printf("O numero %d e igual ao numero %d", primeiro, segundo);
    }
    return(0);
}
