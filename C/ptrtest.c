#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) 
{
    
    char *ptr;
    char *ptr_to_words[3];
    
    char word_array[50];
    
    strcpy(word_array, "hello");
    *(ptr_to_words) = malloc(sizeof(char) * 5 + 1);
    printf("Pointer before assign is %p\n", &ptr_to_words[0]);
    strcpy(*(ptr_to_words), word_array);
    
    printf("Loaction of word is: %p\n", &word_array);
    printf("Location of the first pointer is to: %p\n", &ptr_to_words);
    
    
    strcpy(word_array, "bye");
    *(ptr_to_words + 1) = malloc(sizeof(char) * 3 + 1);
    strcpy(*(ptr_to_words + 1), word_array);
    
    printf("Location of the second pointer is to: %p\n", &(ptr_to_words[1]));
    
    //point first pointer to location of ram, not to pointer.
    
    *ptr_to_words[0] = &ptr_to_words[1];
    
    
    return 0;
    
}
    