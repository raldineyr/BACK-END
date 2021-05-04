#include <stdio.h>

int main()
{
    float radiano, grau;

    printf("Informe o radiano: ");
    scanf("%f",&radiano);

    grau = 57.2957795 * radiano;
    printf("%.2f radiano e %.2f grau.",radiano,grau);
    return (0);
}
