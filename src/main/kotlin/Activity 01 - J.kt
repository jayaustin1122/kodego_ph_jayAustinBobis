fun main (){
    var products = arrayListOf<String>(
        "Shampoo","Soap",
        "Detergent Powder",
        "Pencil","Bond paper",
        "Envelope","Orange",
        "Apples","Grapes")
    var price = arrayListOf<Int>(12,56,36,8,9,78,45,51,32,22)
    var items  = arrayListOf<String>()
    var counter = 0
    var priceCounter = 0
    for (i in products){
        println("${counter+1}. $i Price: ${price[counter]}")
        counter++
    }
    while (true) {
        print("Add Item To cart: ")
        var add: Int = readln().toInt()
        priceCounter += price[add - 1]
        if (add == 1) {
            items.add(products[0])
            products.remove(products[0])
            print("Total Price ${priceCounter}")
        } else if (add == 2) {
            items.add(products[1])
            products.remove(products[1])
            print("Total Price ${priceCounter}")
        } else if (add == 3) {
            items.add(products[2])
            products.remove(products[2])
            print("Total Price ${priceCounter}")
        } else if (add == 4) {
            items.add(products[3])
            products.remove(products[3])
            print("Total Price ${priceCounter}")
        } else if (add == 5) {
            items.add(products[4])
            products.remove(products[4])
            print("Total Price ${priceCounter}")
        } else if (add == 6) {
            items.add(products[5])
            products.remove(products[5])
            print("Total Price ${priceCounter}")
        } else if (add == 7) {
            items.add(products[6])
            products.remove(products[6])
            print("Total Price ${priceCounter}")
        } else if (add == 8) {
            items.add(products[7])
            products.remove(products[7])
            print("Total Price ${priceCounter}")
        } else if (add == 9) {
            items.add(products[8])
            products.remove(products[8])
            print("Total Price ${priceCounter}")
        } else if (add == 10) {
            items.add(products[9])
            products.remove(products[9])
            print("Total Price ${priceCounter}")
        } else if (add > 10 || add < 1) {
            println("Invalid Input or Out of Bounds!")
        } else{
            println("Invalid Input or Out of Bounds!")
        }
        print("Buy Again?Y/N: ")
        var select3 = readln().toString()
        if (select3 == "Y" || select3 == "y")
            continue
        else if (select3 == "N" || select3 == "n"){
            println("Exiting")
            break
        }else print("Invalid Input")
        break
    }
    println("Thank you!")
}
