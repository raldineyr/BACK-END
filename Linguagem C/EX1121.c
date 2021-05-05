#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int r, adivinhe;

    srand((unsigned) time (NULL));
    r = rand();
    printf("Voce consegue adivinhar o numero secreto? Informe: ");
    scanf("%d",&adivinhe);

    if (adivinhe == r)
    {
        puts("Voce adivinhou!");
        return (0);
    }
    if (adivinhe != r)
    {
        puts("Errado!");
        printf("O numero secreto era %d\n",r);
        return(1);
    }
}
