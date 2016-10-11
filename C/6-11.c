/* aprox e given an n */

#include <stdio.h>

int main(void)
{
    int n, i, k;
    float sum, den;
    
    printf("Enter a n to approximate the value of e: ");
    scanf("%d", &n);
    
    sum = 1;
    den = 1;
    for (i = n; i >= 1; i--) {
        for(k = i; k > 1; k-- ) {
            printf("%d\n", k);
            den *= k;
        }
        
        sum += 1 / den;
    }
    
    
    printf("e = %f\n", sum);
    return 0;
}