#include <stdio.h>

int main()
{
    char primeiro_nome[10], segundo_nome[10];

    printf("Informe o seu primeiro nome: ");
    fgets(primeiro_nome,10,stdin);

    printf("Informe o seu segundo nome: ");
    fgets(segundo_nome,10,stdin);

    printf("Prazer em te conhecer %s %s \n",primeiro_nome,segundo_nome);

    return (0);
}
