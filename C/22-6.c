#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(int argc, char *argv[])
{
    
    FILE *fp;
    int si, i, offsetnum;
    unsigned char temp[10];
    
    if (argc != 2) {
        fprintf(stderr, "Usage: ./22-6 FILE\n");
        exit(EXIT_FAILURE);
    }
    
    if ((fp = fopen(argv[1], "rb")) == NULL) {
        fprintf(stderr, "Cant open %s\n", argv[1]);
        exit(EXIT_FAILURE);
    }
    
    printf("Offset          Bytes                       Characters\n");
    printf("------  -----------------------------       -------------\n");
    
    for (offsetnum = 0;; offsetnum += 10) {
        si = fread(temp, 1, 10, fp);
        if (si == 0)
            break;
        
        printf("%6d ", offsetnum);
        for (i = 0; i < si; i ++)
            printf("%.2X ", temp[i]);
        for (; i < 10; i++)
            printf("  ");
        printf("       ");
        for (i = 0; i < si; i++) {
            if (!isprint(temp[i]))
                temp[i] = '.';
            printf("%c", temp[i]);
        }
        printf("\n");
    }
    
    fclose(fp);
    return 0;
}