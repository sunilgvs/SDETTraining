list1 = [10, 20, 23, 11, 17]
list2 = [13, 43, 24, 36, 12]

print("First List ", list1)
print("Second List ", list2)

list3 = []

for i in list1 :
    if (i % 2 != 0):
        list3.append(i)

for i in list2 :
    if(i % 2 ==0):
        list3.append(i)

print(list3)
