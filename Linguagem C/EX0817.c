#include <stdio.h>

int main()
{
    int codigo;

    printf("Informe o codigo de erro (1-3): ");
    scanf("%d",&codigo);

    switch(codigo)
    {
    case 1:
        puts("Falha de direcao, nao e sua culpa.");
        break;
    case 2:
        puts("Formato ilegal, ligue para um advogado.");
        break;
    case 3:
        puts("Pessimo nome de arquivo, melhoreo.");
        break;
    default:
        puts("Isso nao e 1, 2 ou 3.");
    }
    return(0);
}
