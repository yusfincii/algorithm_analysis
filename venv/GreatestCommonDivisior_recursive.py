# calculates greatest common divisor of given two number with recursive method
# using decrease and conquer method - variable size decrease
def greatestCommonDivisor(number1, number2):
    # last step
    if number2 == 0:
        return number1
    temp = number1
    number1 = number2
    number2 = temp % number2

    return greatestCommonDivisor(number1, number2)

    # Time Complexity : log(min(number1, number2))


print(greatestCommonDivisor(32, 3))  # coprime integers
print(greatestCommonDivisor(64, 64))
print(greatestCommonDivisor(1000, 156))
