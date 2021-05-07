#include <stdio.h>

int main ()
{
    int pontuacao[3];

    printf("Informe a sua primeira pontuacao: ");
    scanf("%d",&pontuacao[0]);

    printf("Informe a sua segunda pontuacao: ");
    scanf("%d",&pontuacao[1]);

    printf("Informe a sua terceira pontuacao: ");
    scanf("%d",&pontuacao[2]);

    printf("Informe a sua quarta pontuacao: ");
    scanf("%d",&pontuacao[3]);

    printf("A sua primeira melhor pontuacao e: %d\n",pontuacao[0]);
    printf("A sua segunda melhor pontuacao e: %d\n",pontuacao[1]);
    printf("A sua terceira melhor pontuacao e: %d\n",pontuacao[2]);
    printf("A sua quarta melhor pontuacao e: %d\n",pontuacao[3]);

    return 0;
}
