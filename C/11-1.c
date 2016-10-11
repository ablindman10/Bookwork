/* Find the lowest amount of bills to pay for a bill */

#include <stdio.h>

void pay_amount(int dollars, int *twenties, int *tens, int *fives, int *ones);

int main(void) {
    int twenties, tens, fives, ones, dollars;
    twenties = 0;
    tens = 0;
    fives = 0;
    ones = 0;
    
    printf("Please enter the price of the bill in dollars, no change: ");
    scanf("%d", &dollars);
    
    pay_amount(dollars, &twenties, &tens, &fives, &ones);
    
    printf("Twenties: %d, Tens: %d, Fives: %d, Ones %d\n", twenties, tens, fives, ones);
    
    return 0;
}

void pay_amount(int dollars, int *twenties, int *tens, int *fives, int *ones)
{
    int i;
    
    for (i = 1; i <= dollars; i++) {
        if (dollars - 20 * i >= 0) {
            *twenties += 1;
        }
    }
    dollars -= *twenties * 20;
    
    for (i = 1; i < dollars; i++) {
        if (dollars - 10 * i >= 0)
            *tens += 1;
    }
    dollars -= *tens * 10;
    
    for (i = 1; i <= dollars; i++) {
        if (dollars - 5 * i >= 0)
            *fives += 1;
    }
    dollars -= *fives * 5;
    
    for (i = 1; i <= dollars; i++) {
        if (dollars - i >= 0)
            *ones += 1;
    }
    dollars -= *ones;
    
}