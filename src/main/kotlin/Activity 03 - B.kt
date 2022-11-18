var books = arrayListOf<String>(
    "The Art Of War", "A Room of One’s Own", "The Elements of Style", "The Heart of Haiku", "The Heart of Haiku", "Alfred Hitchcock: The Man Who Knew Too Much","Lifeboat No. 8","Economics in One Lesson","Steal Like an Artist","The Gifts of Imperfection",
    "Very Good Lives","10-Minute Declutter","The Virtue of Selfishness","Smile: The Astonishing Powers of a Simple Act","The Doors of Perception","Guns","Sh*t My Dad Says","The Snows of Kilimanjaro","The Case of the Caretaker","Nine Stories")


fun main() {

    while (true) {
        print("[1]:Add Books\n[2]:Remove Books\n[3]:Search Books\n[4]:Count Books\n[5]:List Of Books\n[6]:Check Record of Books\nEnter>>: ")
        var inputUser: Int = readln().toInt()
        if (inputUser == 1) {
            addBooks()
            continue
        } else if (inputUser == 2) {
            removeBooks()
            continue
        } else if (inputUser == 3) {
            print("Search a Books: ")
            var input1: String = readln().capitalize()
            searchBooks(input1)
            continue
        } else if (inputUser == 4) {
            countBooks()
            continue
        } else if (inputUser == 5) {
            showBooks()
            continue
        } else if (inputUser == 6) {
            print("Check record Enter Title: ")
            var input2: String = readln().capitalize()
            isBooksInRecord(input2)
            continue
        } else println("Invalid Input!")
            break
    }
}
fun isBooksInRecord(book:String):Boolean{
    var counter = 0
    for (i in books) {
        if (book == i ) return true
        else  if (book != i) return false
    }
    println("$book Record is Found.")
    return true
}
fun addBooks(){
    print("Add Books: ")
    var addBooks : String = readln().capitalize()
    books.add(addBooks)
    println("$addBooks is added.")
}
fun removeBooks(){
    print("Remove Books: ")
    var remove : String = readln().capitalize()
    for (i in books) {
        if (remove == i){
            books.remove(remove)
            println("$remove is removed to our list.")
        }else println("Book Not Found.")
    }
}
fun countBooks(){
    println(books.size)
}
fun searchBooksWildSearch(book:String){
    print("Wild Search")
    for (i in books){
        if (book == i)
            println("$i is in the list of Library.")
    }

}
fun searchBooksTitle(name:String){
    println("Search Books Title")
    for (i in books){
        if (name == i)
            println("$i is in the list of Library.")
    }
}
fun searchBooks(book:String){
    if (book.length <= 3) {
        searchBooksWildSearch(book)
    }else if (book.length > 3) {
        searchBooksTitle(book)
    }else println("Invalid Input!")
}
fun showBooks(){
    for (i in books){
        println(i)
    }
}