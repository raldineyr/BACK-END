#include <stdio.h>
#include <math.h>
int main()

{
    float resultado, valor;

    printf("Insira um valor flutuante: ");
    scanf("%f",&valor);

    resultado = sqrt(valor);
    printf("A raiz quadrada de %2.f e: %2.f\n",valor,resultado);

    resultado = pow(valor,3);
    printf("%.2f elevado a terceira potencia e: %.2f\n",valor, resultado);

    resultado = floor(valor);
    printf("O valor %.2f flutuante, arredondado para baixo e %.2f\n",valor,resultado);

    resultado = ceil(valor);
    printf("O valor teto de %.2f e %.2f\n",valor,resultado);

    return (0);
}
