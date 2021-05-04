#include <stdio.h>
#include <math.h>

#define PI 3.14159
#define WAVELENGTH 35
#define PERIODO .1

int main()
{
    float grafico, seno, x;

    for (grafico = 0; grafico < 2 * PI; grafico += PERIODO)
    {
        seno = cos (grafico);
        seno + 1.0;  /*Compensacao por um valor negativo*/

        for (x = 0; x < seno*WAVELENGTH; x++)
            putchar('*');
        putchar('\n');
    }
    return 0;
}
