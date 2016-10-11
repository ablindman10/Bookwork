#include <stdio.h>


struct {
    char name[25];
    int age;
} person1 = {"Brian", 22};


int main(void)
{

    printf("Person name is %s\n", person1.name);
    printf("Person age is: %d\n", person1.age);
    return 0;
}