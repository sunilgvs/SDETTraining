fruit_shop = {
    "apple" :10,
    "kiwi" :50,
    "bananna" :30,
    "sweet potato" :30,
}

keytocheck = input("Check your fruit availability : ").lower()

if keytocheck in fruit_shop:
    print("your fruit is available Enjoy and purchase from counter by paying Cash ")
else:
    print("Come back next Time")