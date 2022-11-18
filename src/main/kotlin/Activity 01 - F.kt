fun main(){
    while (true) {
        println("Enter a word: ")
        var userEntered: String = readln().toString()
        for (i in 0 until userEntered.length) {
            var new : Int = 0
            for (j in 0 until userEntered.length) {
                if (userEntered[i] == userEntered[j] && i != j) {
                    new = 1
                    break
                }
            }
            if (new == 0){
                print("${userEntered[i]}")
            }
        }
    }
}