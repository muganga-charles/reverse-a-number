#include <stdio.h>
#include <stdlib.h>

int main()
{
    //a program that reverses a number
    int number, reverse = 0, remainder;
    printf("Enter a number: ");
    scanf("%d", &number);
    while (number != 0)
    {
        remainder = number % 10;//gets the remainder
        reverse = reverse * 10 + remainder;
        number /= 10;
        
    }
    printf("%d", reverse);//prints the reverse number
    return 0;
}
