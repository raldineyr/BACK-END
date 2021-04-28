#include <stdio.h>

int main()
{
    int L1,L2,L3;

    for (L1 = 'A'; L1 <= 'Z'; L1 = L1 + 1)
    {
        for (L2 = 'A'; L2 <= 'Z'; L2 = L2 + 1)
        {
           for (L3 = 'A'; L3 <= 'Z'; L3 = L3 + 1)
           {
               printf("%c%c%c\t",L1,L2,L3);
           }
        }
        putchar('\n');
    }
    return(0);
}
