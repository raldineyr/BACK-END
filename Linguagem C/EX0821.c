#include <stdio.h>

int main()
{
    int a, b, maior;

    printf("Informe o valor A: ");
    scanf("%d",&a);

    printf("Informe o valor B: ");
    scanf("%d",&b);

    maior = (a > b) ? a : b;

    printf("O valor %d e o maior",maior);
    return(0);
}
