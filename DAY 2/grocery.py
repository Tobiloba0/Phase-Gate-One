print("Welcome to Tobiloba Online Strore");
menu = """
        Select from the options displayed below.
        1. Add items
        2. Remove items 
        3. Show all available items

        """;
print (menu)

products = []
prices = []

while True:
    name = input("Enter product name or type 'done' to finish: ")
    if name.lower() == "done":
        break
    price_input = input(f"Enter price for {name}: ")
    if price_input > 0:
        price = float(price_input)
        products.append(name)
        prices.append(price)
    else:
        print("Invalid price, try again.")


