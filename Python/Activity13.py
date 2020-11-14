def sum(num_list):
    sum = 0
    for i in num_list:
        sum += i
    return sum



num_list = [10,20,30,40]

print(num_list)
result = sum(num_list)
print("The sum of all element in the list ", str(result))