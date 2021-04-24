#include <stdio.h>

int main()
{
    int a, b;

    a = 5;
    b = -3;

    if(a == b); // ERRANDO DE PROPOSITO
    {
        printf("%d e igual a %d", a, b);
    }
    return(0);
}


