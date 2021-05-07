#include <stdio.h>

int main()
{
    int pontuacao[10];
    int x;

    for (x = 0; x <10; x++)
    {
        printf("Digite a #%d pontuacao: ",x+1);
        scanf("%d",&pontuacao[x]);
    }
        for (x = 0; x < 10; x++)
        {
            printf("A pontuacao #%d foi: %d\n",x+1, pontuacao[x]);
        }

    return 0;
}
