#include <stdio.h>

int main()
{
    char regressivo;

    for (regressivo = 'z'; regressivo >= 'a'; regressivo = regressivo - 1)
    {
        printf("%c\t",regressivo);
    }
    return(0);
}
