#include <stdio.h>

void vegas (void);

int main ()
{
    int a;

    a = 365;

    printf("Na funcao main, a=%d\n",a);

    vegas();

    printf("Na funcao main, a=%d\n",a);

    return 0;
}

void vegas (void)

{
    int a;

    a = -10;
    printf("Na funcao vegas, a=%d\n",a);
}
