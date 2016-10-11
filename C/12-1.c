#include <stdio.h>
#define N 100

void reverse(char *a, int n);


int main(void)
{
    char a[N], *ptr;
    int i = 0;
    int length = 0;
    printf("Eneter a message: ");
    
    for (ptr = a; ptr < a + N; ptr++) {
        *ptr = getchar();
        if (*ptr == '\n')
            break;
        length++;
    }
    
    printf("Reversal is: ");
    for (ptr = a + length; ptr >= a; ptr--) {
        printf("%c", *ptr);
    }
    putchar('\n');
    
    return 0;
}