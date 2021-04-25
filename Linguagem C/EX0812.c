#include <stdio.h>
#define SECRETO 12

int main()
{
   int x;

   printf("Informe o numero secreto: ");
   scanf("%d",&x);

   if(x == SECRETO)
   {
    printf("Parabens voce acertou!");
    return(1);
   }
   else
   {
       printf("ERROU!");
       return(0);
   }
    return (0);
}
