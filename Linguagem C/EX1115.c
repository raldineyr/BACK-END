#include <stdio.h>
#include <math.h>
#define PI 3.14159
#define WAVELENGTH 70
#define PERIOD .1

int main()
{
    float grafico, seno, x;

    for (grafico = 0; grafico < PI; grafico += PERIOD)
    {
        seno = sin(grafico);
        for (x = 0; x < seno*WAVELENGTH;x++)
            putchar('*');
        putchar('\n');
    }
    return 0;
}
