#include <stdio.h>

int main()
{
    int escolha;

    puts("Planos de refeicao:");
    puts("A - Cafe da manha, almoco e janta;");
    puts("B - Almoco e janta somente;");
    puts("C - Janta somente.");
    printf("Digite a sua escolha: ");
    scanf("%s",&escolha);

    printf("Voce optou por: ");

    switch (escolha)
    {
        case 'A':
        printf(" A - Cafe da manha,");
        case 'B':
        printf(" B - almoco e ");
        case 'C':
        printf("janta,");
        default:
        printf(" este foi o seu plano de refeicao.");
    }
    return(0);
}
