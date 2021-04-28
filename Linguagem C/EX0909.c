#include <stdio.h>

int main()
{
    int alfabeto;

    for(alfabeto = 'A'; alfabeto <= 'Z'; alfabeto = alfabeto + 1)
    {
        printf("%d\t",alfabeto);
    }
    return(0);
}
