/* Craps game */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

int roll_dice(void);
bool play_game(void);

int main(void)
{
    int win = 0, loss = 0;
    char choice = 'y';
    bool game;
    
    while(choice == 'y' || choice == 'Y') {
            game = play_game();
            if (game == true) {
                win++;
                printf("You win!\n");
            }
            else if (game == false) {
                loss++;
                printf("You Lose!\n");
            }
            printf("\nPlay again? ");
            scanf("%s", &choice);
            printf("\n");
        }
        
        printf("Wins: %d    Losses: %d\n", win, loss);
    

    
    return 0;
}

bool play_game(void)
{
    bool first_roll = true;
    bool point = false;
    int value = roll_dice();
    if ((value == 7 || value == 11) && first_roll == true) {
        printf("You rolled: %d", value);
        first_roll = false;
        return true;
    }
    else if (value == 2 || value == 3 || value == 12) {
        printf("You rolled %d", value);
        return false;
    }
    else if (value == 7) {
        printf("You rolled %d", value);
        return false;
    }
}

int roll_dice(void)
{
    int sum = 0;
    srand((unsigned) time(NULL));
    sum += rand() % 7;
    sum += rand() % 7;
    
    return sum;
}