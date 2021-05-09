#include <stdio.h>

int main()
{
    char primeironome[16],sobrenome[16];

    printf("informe o seu primeiro nome: ");
    fgets(primeironome,16,stdin);

    printf("Informe o seu sobrenome: ");
    fgets(sobrenome,16,stdin);

    printf("Ola,%s%s e um prazer te conhecer.\n",primeironome,sobrenome);
    return 0;
}
