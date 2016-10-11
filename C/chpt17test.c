/* sorts series of words */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_WORDS 10
#define MAX_LEN 20

// word array, and max length
void sort(char **str, int n);

int main(void)
{
    char *ptr_to_string[4];
    char word[MAX_LEN + 1];
    
    int k, i = 0, len = 1;
    
    *(ptr_to_string) = malloc(sizeof(char) * 3 + 1);
    strcpy(word, "zfe");
    strcpy(*ptr_to_string, word);
    
    printf("Here is the first word: %s\n", *ptr_to_string);
    
    *(ptr_to_string + 1) = malloc(sizeof(char) * 5 + 1);
    strcpy(word, "abcde");
    strcpy(*(ptr_to_string + 1), word);
    
    *(ptr_to_string + 2) = malloc(sizeof(char) * 2 + 1);
    strcpy(word, "zz");
    strcpy(*(ptr_to_string + 2), word);
    
    *(ptr_to_string + 3) = malloc(sizeof(char) * 1 + 1);
    strcpy(word, "p");
    strcpy(*(ptr_to_string + 3), word);
    
    
    
    printf("Here is the second word: %s\n", *(ptr_to_string + 1));
    
    printf("Here is the value of strcmp %d\n", strcmp("zz", "p"));

    

    sort(ptr_to_string, 4);
    
    printf("Here is the first word: %s\n", *ptr_to_string);
    printf("Here is the second word: %s\n", *(ptr_to_string + 1));
    
    printf("Here is the third word: %s\n", *(ptr_to_string + 2));
    printf("Here is the fourth word: %s\n", *(ptr_to_string + 3));
    
    return 0;
}


void sort(char **str, int n)
{
    int i;
    char *temp;
    
    for (i = 0; i < n - 1; i++) {
        if ( strlen(*(str + i)) < strlen(*(str + i + 1))) {
            temp = *(str + i);
            *(str + i) = *(str + i + 1);
            *(str + i + 1) = temp;
        }
            
    }
    
}