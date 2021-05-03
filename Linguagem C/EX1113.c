#include <stdio.h>
int main()
{
    float grau, radiano;

    printf("Insira um angulo em graus: ");
    scanf("%f",&grau);

    radiano = 0.0174532925 * grau;

    printf("%.2f graus, sao %.2f radiano.\n", grau, radiano);
    return (0);
}
