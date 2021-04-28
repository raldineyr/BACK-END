#include <stdio.h>

int main()
{
    char alfabeto;

    for(alfabeto ='A'; alfabeto <='Z'; alfabeto = alfabeto + 1)
    {
        printf("%c\t",alfabeto);
    }
    return(0);
}
