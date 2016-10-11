#include <stdio.h>
#include <stdbool.h>

int main(void)
{
    int repeats[10] = {0};
    bool flag = 0;
    int digit, i;
    long n;
    
    printf("Enter a number: ");
    scanf("%ld", &n);
    while (n > 0) {
        digit = n % 10;
        switch(digit) {
            case 0: repeats[0] += 1; break;
            case 1: repeats[1] += 1; break;
            case 2: repeats[2] += 1; break;
            case 3: repeats[3] += 1; break;
            case 4: repeats[4] += 1; break;
            case 5: repeats[5] += 1; break;
            case 6: repeats[6] += 1; break;
            case 7: repeats[7] += 1; break;
            case 8: repeats[8] += 1; break;
            case 9: repeats[9] += 1; break;
        }
    n /= 10;
    }
    printf("Repeated digit(s): ");
    
    for (i = 0; i <= 9; i++) {
         if( repeats[i] >= 2) {
            printf("%d ", i);
            flag = 1;
         }
    }
    if (flag == 1)
        printf("\n");
    if (flag == 0)
        printf("No repeated digits\n");
    
    return 0;
}