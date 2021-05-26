#include <stdio.h>

#define SIZE 21

int main()
{
    char bubble[] = "C Programming is fun!";
    char temp;
    int inner,outer,x;

/* Display original array */
    puts("Original Array:");
    for(x=0;x<SIZE;x++)
        printf("%c",bubble[x]);
    putchar('\n');

/* Bubble sort */
    for(outer=0;outer<SIZE-1;outer++)
    {
        for(inner=outer+1;inner<SIZE;inner++)
        {
            if(bubble[outer] > bubble[inner])
            {
                temp=bubble[outer];
                bubble[outer] = bubble[inner];
                bubble[inner] = temp;
            }
        }
    }

/* Display sorted array */
    puts("Sorted Array:");
    for(x=0;x<SIZE;x++)
        printf("%c",bubble[x]);
    putchar('\n');

    return(0);
}

// RESPOSTA DO AUTOR DAN GOOKIN
