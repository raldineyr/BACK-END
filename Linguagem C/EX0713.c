#include <stdio.h>

int main()
{
   char primeiro_nome[15], segundo_nome[15];

   printf("Digite o seu primeiro nome: ");
   scanf("%s",primeiro_nome);

   printf("Digite o seu seguno nome: ",segundo_nome);
   scanf("%s",segundo_nome);

   printf("\nE um prazer te conhecer %s %s.",primeiro_nome, segundo_nome);


    return (0);
}
