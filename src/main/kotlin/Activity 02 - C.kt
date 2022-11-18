fun main() {
    print("----Grocery Inventory System----")
    println(" ")
    var productsTioletries = arrayListOf<String>("Shampoo", "Soap", "Detergent Powder")
    var productsScSupplies = arrayListOf<String>("Pencil", "Bond papers", "envelopes")
    var productsFruitsAndVegetables = arrayListOf<String>("Cabbage", "Orange", "Apple")

    println("----TIOLETRIES-----")
    for (i in productsTioletries) println(i)
    println("----School Supplies-----")
    for (j in productsScSupplies) println(j)
    println("----Fruits/Vegetables-----")
    for (k in productsFruitsAndVegetables) println(k)
}