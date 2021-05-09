#include <stdio.h>

int main()
{
    char primeironome [16];

    printf("Qual o seu primeiro nome? ");
    fgets(primeironome,16,stdin);
    printf("Prazer em te conhecer %s\n",primeironome);

    return 0;
}
