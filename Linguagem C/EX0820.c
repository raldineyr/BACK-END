#include <stdio.h>

int main()
{
    char escolha;

    puts("Planos de refeicao: \n");
    puts("A - Cafe da manha, almoco e janta;");
    puts("B - Almoco e janta;");
    puts("C - Janta, somente.\n");

    printf("Sua escolha: ");
    scanf("%c",&escolha);

    printf("Voce optou por ");
    switch(escolha)
    {
    case 'A':
    case 'a':
        puts("cafe da manha,");
    case 'B':
    case 'b':
        puts(" almoco e");
    case 'C':
    case 'c':
        puts(" janta.");
    default:
        printf("e o seu plano de refeicao.");
    }

    return(0);
}
