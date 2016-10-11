#include <stdio.h>

#define N 10

void max_min(int a[], int n, int *max, int *min);

int main(void)
{
    int b[N], i, big, small;
    
    printf("Enter %d numbers: ", N);
    for (i = 0; i < N; i++)
        scanf("%d", &b[i]);
    
    max_min(b, N, &big, &small);
    
    printf("Largest: %d\n", big);
    printf("Smallest: %d\n", small);
    
    return 0;
}

void max_min(int a[], int n, int *max, int *min)
{
    int i, *ptr;
    *max = *a;
    *min = *a;
    for (ptr = a; ptr < a + N; ptr++) {
        if (*ptr > *max)
            *max = *ptr;
        else if (*ptr < *min)
            *min = *ptr;
    }
}