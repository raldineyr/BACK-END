#include <stdio.h>

int main()
{
    int x;

    for (x = -5; x < 5; x ++)
        printf("%d\n",x);
    for (; x >= -5; x--)
        printf("%d\n", x);
    putchar('\n');
    return (0);
}
