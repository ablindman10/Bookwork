#include <stdio.h>

struct dialing_code {
    char *country;
    int code;
};

const struct dialing_code country_codes[] = {"Argentina", 54, "Brazil", 55, "China", 86, "Congo, Dem. Rep of", 243,
    "Ethiopia", 251, "Germany", 49, "Indonesia", 62, "Italy", 39, "Mexico", 52, "Pakistan", 92, "Poland", 48, "South Africa", 27, "Spain", 34, "Thailand", 66, "Ukraine", 380, "United States", 1
};

int main(void)
{
    int i, code, found = 0;
    
    printf("Enter a area code (only use the first row from page 388-389): ");
    scanf(" %d", &code);
    printf("Code is %d\n", code);
    
    for (i = 0; i < 16; i++) {
        if (country_codes[i].code == code) {
            printf("The country is: %s\n", country_codes[i].country);
            found = 1;
            break;
        }
    }
    
    if (found == 0)
        printf("Error country code not found\n");
    
    return 0;
}