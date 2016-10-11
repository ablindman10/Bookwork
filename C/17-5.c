/* sorts series of words */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_WORDS 10
#define MAX_LEN 20

// word array, and max length
int length(char *str, int n);
void sort(char **str, int n);

int main(void)
{
    char *ptr_to_string[MAX_WORDS];
    char word[MAX_LEN + 1];
    
    int k, i = 0, len = 1;
    
    for (;;) {
        printf("enter a word: ");
        len = length(word, MAX_LEN);
        printf("Length = %d\n", len);
        if (len == 0)
            break;
        *(ptr_to_string + i) = malloc(sizeof(word));
        if (*(ptr_to_string) == NULL) {
            printf("\n Error failed to allocate ram!");
            exit(EXIT_FAILURE);
        }
        strcpy(*(ptr_to_string + i), word);
        i++;
    };
    
    sort(ptr_to_string, i);
    
    for (k = 0; k < i; k++) {
        printf("Here was what you typed %s\n", *(ptr_to_string + k));
        free(*(ptr_to_string + k));
    }
    
    return 0;
}

int length(char *str, int n)
{
    char c;
    int i = 0;
    while (!isspace(c = getchar()) && i < n)
        *(str + i++) = c;
    
    *(str + i) = '\0';
    return i;
}

void sort(char **str, int n)
{
    int i, j, s = 1;
    char *temp;
    
    while (s) {
        s = 0;
        for (i = 0; i < n - 1; i++) {
            if ( strlen(*(str + i)) < strlen(*(str + i + 1))) {
            temp = *(str + i);
            *(str + i) = *(str + i + 1);
            *(str + i + 1) = temp;
            s = 1;
            }
            
        }
    }
}