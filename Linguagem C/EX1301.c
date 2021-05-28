#include <stdio.h>
#include <ctype.h>

int main(){


    char frase[]= "\nSOMETIMES\n\nAs vezes e um vento mais forte\ne ele vem de longe, tangendo as colinas\
\nE as tardes se emancipam de mim,\ncomo se fossem feitas de puro desejo.\n\nUm azul intenso devora meus dedos\
\ne os olhos, inteiros, sao de oceano e vao\ne eu estou perdida: nao ha portas\
mas as chaves persistem,\npendendo de minhas maos.\n\nUm vento que me fala em uma outra lingua\
\ne, ainda assim,\ntoda me devora,\ne nao ha apelo,\n\
e nao ha distancia que o coloque de volta:\nentra pelos meus cabelos\ne faz deles sua mais perfeita morada.\n\n\
Um vento, e eu de todo exilada.\nUm vento, e eu desfeita,\ncalada.\nUm vento e, pobre de mim,\nsou toda feita de agua.\n\n- Livia Natalia\n\n";

    int indice, alpha, blank, punct;

    alpha = blank = punct = 0;

    indice = 0;
    while (frase[indice]){

        if(isalpha(frase[indice]))
            alpha++;

        if(isblank(frase[indice]))
            blank++;

        if(ispunct(frase[indice]))
            punct++;

        indice++;
    }

    printf("\"%s\"\n",frase);
    puts("Estatistica: \n");
    printf("%d caracteres do alfabeto;\n",alpha);
    printf("%d caracteres em branco ou nulo;\n",blank);
    printf("%d simbolos de pontuacao.\n",punct);


    return 0;
}
