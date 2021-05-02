#include <stdio.h>

int main()
{
    int a, b;

    b = 16;

    printf("Antes, \"a\" nao esta atribuido a \"b\"=%d\n.", b);
    a=b++;
    printf("Depois, a=%d e b=%d\n",a, b);
    return (0);
}
