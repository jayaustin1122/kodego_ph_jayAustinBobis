fun main() {
    // enter user
    print("Enter a string/number to check if its palindrome\n ->>: " )
    var word = readln().toString()
    // reversing the input of the user
    var reverse = word.reversed()
    //comparing
    if (word == reverse)
        println("$word is a Palindrome.")
    else println("$word is not a palindrome.")
}
