#include <stdio.h>

int main()
{
    int coordenada;

    printf("Informe o valor da coordenada do alvo: ");
    scanf("%d",&coordenada);

    if (coordenada < -5 || coordenada > 5)
    {
        printf("Perto o suficiente!");
    }
    else
    {
        printf("Alvo fora do alcance!");
    }
    return (0);
}
