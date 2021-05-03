#include <stdio.h>
#include <math.h>

int main()
{
    float duplo;

        puts("Os numeros sagrados da computacao.");

        for(duplo = 0; duplo <= 10; duplo++)
        {
            printf("2^%.0f = %.0f\n",duplo,pow(2,duplo));
        }
    return (0);
}
