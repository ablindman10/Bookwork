/* Program finds the smallest string thats entered by the user */

#include <stdio.h>
#include <string.h>

#define MAX_WORD 20


int main(void)
{
    char input[MAX_WORD];
    int i, first_word = 0;
    char smallest_word[MAX_WORD];
    char largest_word[MAX_WORD];
    
    
    for (;;) {
        printf("Enter a word: ");
        scanf(" %s", input);
        if (first_word == 0) {
            strcpy(smallest_word, input);
            strcpy(largest_word, input);
            first_word = 1;
        }
        
        else if (first_word == 1 && (strcmp(input, smallest_word) < 0))
            strcpy(smallest_word, input);
        else if (first_word == 1 && (strcmp(input, largest_word) > 0))
            strcpy(largest_word, input);
        
        else if (strlen(input) == 4) {
            break;
        }
    }
    
    printf("Smallest word: %s\n", smallest_word);
    printf("Largest word: %s\n", largest_word);
    
    
    return 0;
}
    