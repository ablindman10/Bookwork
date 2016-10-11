#include <stdio.h>

int main(void)
{
    int i = 3;
    int *ptr = &i;
    
    printf("Printing i as a i %d\n", i);
    printf("Printing i as a &i %p\n", &i);
    printf("Printing ptr: %p\n", ptr);
    printf("Printing ptr: %p\n", &ptr);
    printf("Printing ptr %d", *ptr);
    
    return 0;
}