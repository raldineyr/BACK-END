#include <stdio.h>

int main()
{
    char name [4];
    printf("Quem e voce? ");
    fgets(name,4,stdin);

    printf("E um prazer te conhecer %s",name);
    return (0);
}
