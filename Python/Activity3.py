user1 = input("what is Player1 Name ")
user2 = input("what is Player2 Name ")

user1_ans = input(user1 + ", do you want to choose rock, paper or scissor? " ).lower()
user2_ans = input(user2 + ", do you want to choose rock, paper or scissor? " ).lower()

if user1_ans == user2_ans:
    print("its tie ")
elif user1_ans == "rock": 
    if user2_ans == "scissor":
        print(" Rock Wins ")
    else:
        print(" scissor Wins ")
elif user1_ans == "paper": 
    if user2_ans == "scissor":
        print(" Scissor Wins ")
    else:
        print(" Rock Wins ")
elif user1_ans == "rock": 
    if user2_ans == "paper":
        print(" Paper Wins ")
    else:
        print(" Scissor Wins ")
else:
    print(" Enter Values Correctly")

    