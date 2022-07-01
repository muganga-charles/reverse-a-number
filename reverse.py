#a program that reverses a number
def reverse(number):
    reverse = 0
    while number > 0:
        reverse = reverse * 10 + number % 10
        number = number // 10
    return reverse
def main():
    number = int(input("Enter a number: "))
    print("The reverse of", number, "is", reverse(number))
main()