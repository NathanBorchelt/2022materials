money = 150

store_inventory = {
    "calculator": 30,
    "horse": 40,
    "guitar":50}
player_inventory = []
items = store_inventory.keys()
purchase = ""
while (True):
    for item in items:
        print("{:10s} : {:3d}".format(item, store_inventory[item]))
    print("Money: " +str(money))
    purchase = input("Select an item to buy: ")
    if( (purchase in items)):
        if((money - store_inventory[purchase]) >= 0):
            player_inventory.append(purchase)
            money -= store_inventory[purchase]
            print("You have bought a " + purchase)
            invStrOut = "You have "
            for owned in player_inventory:
                invStrOut += owned + " "
            print(invStrOut)
        else:
            print("You cannot afford "+purchase)

    elif(purchase == "quit"):
        break
    else:
        print("The store does not sell "+purchase)
    print()
