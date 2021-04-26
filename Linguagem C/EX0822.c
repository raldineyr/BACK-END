#include <stdio.h>

int main()
{
    int a, b, maior;

    printf("Informe o numero A: ");
    scanf("%d",&a);

    printf("Informe o numero B: ");
    scanf("%d",&b);

    if(a > b)
    {
        maior = a;
        printf("O valor A = %d e maior",maior);
    }

    else if (a < b)
    {
        maior = b;
        printf("O valor B = %d e maior",maior);
    }
    return (0);
}
