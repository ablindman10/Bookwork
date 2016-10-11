/* compute 3x^5 + 2x^4 - 5x^3 - x^2 + 7x -6 */

#include <stdio.h>
#include <math.h>

double funct(double x);

int main(void)
{
    double number;
    
    printf("Please enter a number to compute: ");
    scanf("%lf", &number);
    
    printf("\nThe value returned is: %.2lf\n", funct(number));
}

double funct(double x)
{
    double y = 0;
    
     y = 3 * pow(x, 5) + 2 * pow(x, 4) - 5 * pow(x, 3) - pow(x, 2) - 7 * x - 6;
    
    return y;
}