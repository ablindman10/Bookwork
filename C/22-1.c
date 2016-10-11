#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    FILE *fp;
    int i;
    
    if (argc == 0) {
        printf("usage: 22-1 FILENAME FILENAME FILENAME ...\n");
        exit(EXIT_FAILURE);
    }
    
    for ( i = 1; i < argc; i++) {
        if ((fp = fopen(argv[i], "r")) == NULL) {
            printf("%s can't be opened\n", argv[i]);
            exit(EXIT_FAILURE);
        }
        printf("%s can be opened\n", argv[i]);
        fclose(fp);
    }
    return 0;
}
