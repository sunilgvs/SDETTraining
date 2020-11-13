numbers = list(input("Enter the numbers ").split(","))
sum = 0
print(numbers)
#print(str(numbers))
for number in numbers:
    print(number)    
    sum += int(number)
print(sum)