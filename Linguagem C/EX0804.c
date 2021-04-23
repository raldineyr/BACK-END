#include <stdio.h>

int main()
{
    int primeiro, segundo;

    printf("Informe o primeiro valor: ");
    scanf("%d",&primeiro);

    printf("Informe o segundo valor: ");
    scanf("%d",&segundo);

    if(primeiro > segundo)
    {
        printf("%d e maior que %d.", primeiro, segundo);
    }
    if(primeiro < segundo)
    {
        printf("%d e menor que %d.", primeiro, segundo);
    }
    return (0);
}
