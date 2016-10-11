#include <stdio.h>

int main(void)
{
    float num, bigest;
    
    printf("Enter a number: ");
    scanf("%f", &num);
    bigest = num;
    
    do {
        printf("Enter a number: ");
        scanf("%f", &num);
        
        if (num >= bigest)
            bigest = num;
    } while (num != 0);
    
    printf("The largest number entered was %f\n", bigest);
    
    return 0;
}
        