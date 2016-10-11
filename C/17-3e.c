#include <stdio.h>
#include <stdlib.h>

int *create_array(int n, int initial_value);


int main(void)
{
    int *p, i;
    p = create_array(3, 5);
    
    for (i = 0; i < 3; i++) {
        printf("%d", p[i]);
    }
    
    return 0;
}

int *create_array(int n, int initial_value)
{
    int *arr, i;
    arr = malloc(n * sizeof(int));
    

    if (arr == NULL) {
        printf("Failed to allocate ram.\n");
        exit(EXIT_FAILURE);
    }
    
    for (i = 0; i < n; i++) {
        arr[i] = initial_value;
    }
    
    return arr;
}