#include <stdio.h>

int main()
{
    int pontuacao[4];
    int x;

    for (x = 0; x < 4; x++)
    {
        printf("A pontuacao #%d foi: ",x+1);
        scanf("%d",&pontuacao[x]);
    }
        puts("Essas sao as suas pontuacoes: ");
        for (x = 0; x < 4; x++)
        {
            printf("#%d %d\n",x+1,pontuacao[x]);
        }
    return 0;
}
