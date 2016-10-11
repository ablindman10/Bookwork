#include <stdio.h>

int main(void) {
    int n, i, j, sum;
    int arr[5][5] = {0};
    
    printf("This will be a 5 X 5 array\n");
    for (j = 0; j < 5; j++) {
        printf("Enter row %d: ", (j +1));
        for (i = 0; i < 5; i++) {
            scanf(" %d", &arr[j][i]);
        }
    }
    
    printf("Row totals: ");
    for (j = 0; j < 5; j++) {
        sum = 0;
        for (i = 0; i < 5; i++) {
            sum += arr[j][i];
        }
        printf("%d ", sum);
    }
    
    printf("\n");
    printf("Column totals: ");
    for (j = 0; j < 5; j++) {
        sum = 0;
        for ( i = 0; i < 5; i++) {
            sum += arr[i][j];
        }
        printf("%d ", sum);
    }
    return 0;
}