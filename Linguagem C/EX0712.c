#include <stdio.h>

int main()
{
    char primeiro_nome [15];

    printf("Escreva o seu primeiro nome: ");
    scanf("%s",primeiro_nome);

    printf("E um prazer em te conhecer, %s.\n",primeiro_nome);
    return (0);
}
