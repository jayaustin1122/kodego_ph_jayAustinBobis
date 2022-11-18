fun main() {
    print("Enter Number1: ")
    var num1 = readln().toInt()
    print("Enter Number1: ")
    var num2 = readln().toInt()
    println("The prime number between $num1 and $num2 are:")
    for(i in num1..num2) {
        if (i > 1) {
            for (j in 2..i/2) {
                if (i % j == 0) {
                    break
                }else{
                    println(i)
                }

            }
        }
    }
}
