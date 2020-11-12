username = input("Enter UserName : ")
age = int(input("Enter Age : "))
import datetime

currentyear = datetime.datetime.now()
year = str((currentyear.year - age) +100)
print(currentyear)

print(username + "   will be 100 years old in the year  "  + year)