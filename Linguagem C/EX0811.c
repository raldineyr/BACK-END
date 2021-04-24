#include <stdio.h>

int main()
{
    int a, b;

    a = 6;

    printf("Informe um numero: ");
    scanf("%d",&b);

    if(a > b)
    {
        printf("%d e maior que %d", a, b);
    }
    else
    {
        printf("%d e menor que %d", a, b);
    }

    return(0);
}
