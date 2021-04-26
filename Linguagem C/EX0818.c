#include <stdio.h>

int main()
{
    int codigo;

    printf("Informe um codigo de (A-C): ");
    scanf("%c",&codigo);

    switch(codigo)
    {
    case 'A':
        puts("Falha na direcao, nao e sua culpa.");
        break;
    case 'B':
        puts("Formato ilegal, ligue para um advogado.");
        break;
    case 'C':
        puts("Pessimo nome de arquivo, melhoreo");
        break;
    default:
        puts("Isso nao e A, B, ou C.");
    }
    return (0);
}
