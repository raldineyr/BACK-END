#include <stdio.h>

int main()
{
    char nome[16],sobrenome[16];

    printf("Informe o seu nome: ");
    scanf("%s %s",&nome,&sobrenome);

    printf("Ola, %s %s e um prazer te conhecer,",nome,sobrenome);
    return 0;
}
