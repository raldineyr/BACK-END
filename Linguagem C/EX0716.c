#include <stdio.h>

int main()
{
    char name[10];

    printf("Quem e voce? ");
    fgets(name,10,stdin);
    printf("E um prazer te conhecer %s \n",name);
    return(0);
}
