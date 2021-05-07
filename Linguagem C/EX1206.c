#include <stdio.h>

int main()
{
    float fechamento[]= {14450.06,14458.62,144539.14,14514.11,14452.06};
    int x;

    puts("Fechamento do mercado de acoes: ");
    for(x = 0; x < 5; x++)
    {
        printf("Dia #%d: %.2f\n",x+1,fechamento[x]);
    }
    return 0;
}
