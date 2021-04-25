#include <stdio.h>

int main()
{
    int comando;

    printf("Voce deseja continuar?\n");
    printf("Aperte S para (sim) ou N para (nao): ");
    scanf("%s",&comando);

    if (comando  == 'S' || comando == 's' )
    {
        printf("Bem vindo ao sistema!\n");
    }
    else if (comando == 'N' || comando == 'n')
    {
        printf("Fim da sessao.\n");
    }
    else
    {
        printf("Comando incompriensivel.");
    }
    return (0);
}
