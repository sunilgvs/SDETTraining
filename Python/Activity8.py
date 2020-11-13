numbers = list(input("Enter your desired Number example  10,20,30  :").split(","))
print(numbers)
firstlist = numbers[0]
lastlist = numbers[-1]
print(firstlist)
print(lastlist)

if (firstlist == lastlist):
    print("True")
else:
    print("False")