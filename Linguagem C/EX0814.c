#include <stdio.h>

int main()
{
    int coordenada;

    printf("Insira a coordenada do alvo: ");
    scanf("%d",&coordenada);

    if (coordenada >= -5 && coordenada <= 5)
    {
        puts("Perto o suficiente!");
    }
    else
    {
        puts("Alvo fora do alcance!");
    }
    return(0);
}
