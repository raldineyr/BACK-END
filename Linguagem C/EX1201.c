#include <stdio.h>

int main()
{
    int pontuacao1, pontuacao2, pontuacao3;

    printf("Informe a sua primeira pontuacao: ");
    scanf("%d",&pontuacao1);

    printf("Informe a sua segunda pontuacao: ");
    scanf("%d",&pontuacao2);

    printf("Informe a sua terceira pontuacao: ");
    scanf("%d",&pontuacao3);

    puts("Essas sao as suas pontuacoes: ");
    printf("#1 %d\n",pontuacao1);
    printf("#2 %d\n",pontuacao2);
    printf("#3 %d\n",pontuacao3);

    return 0;
}
