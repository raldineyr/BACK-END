#include <stdio.h>

void prompt();
void busy();        /*PROTÓTIPO DA FUNÇÃO*/

int main()
{
    busy();

    return (0);
}

void busy()
{
    int loop;
    char input[32];

    loop = 0;
    while (loop < 5)
    {
        prompt();
        fgets(input, 31, stdin);
        loop = loop + 1;
    }
}
                    /*INFORMAÇÃO NO PROMPT DE COMANDO*/
void prompt()
{
    printf("C:\\DOS> ");
}
