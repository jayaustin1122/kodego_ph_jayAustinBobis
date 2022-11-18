var cart = hashMapOf<String,Int>()
var grocery = arrayListOf<String>("Bread","Fita","Stick-O","MILK","Eggs",
    "Candy","Chips","Cookies","Wine","Coffee",
    "Ice Cream","Rice","Donuts","Canned Goods","Noodles",
    "Soap","Batteries","Vinegar","Salt","Sugar")
fun main (){
    while (true) {
        print("[1]:Add Product\n[2]:Remove Product\n[3]:Check Out\n[0]:Exit\nEnter>>: ")
        var inputUser: Int = readln().toInt()
        if (inputUser == 1) {
            addToCart()
            continue
        } else if (inputUser == 2) {
            removeFromCart()
            continue

        } else if (inputUser == 3) {
            checkOut()
            continue
        } else if (inputUser == 0) {
            println("Thank You!:)")
            break
        }else println("Invalid Input!")
            break
    }

}
fun addToCart(){
    print("Add Product: ")
    var add : String = readln().capitalize()
    print("Add Product qty: ")
    var qty : Int = readln().toInt()
    cart.put(add,qty)
    println("$add is added.")
}
fun checkOut(){
    println("Number of item's Checkout: ${cart.size}")
    for (i in cart)
        println(i)
}
fun removeFromCart() {
    print("Remove Product: ")
    var remove : String = readln().capitalize()
    cart.remove(remove)
    println("Success! $remove is Removed.")
}