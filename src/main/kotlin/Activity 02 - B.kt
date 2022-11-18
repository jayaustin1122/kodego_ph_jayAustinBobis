fun main(args: Array<String>) {

    println("---E-Library---")
    var booksCanBarrow = arrayListOf<String>("Algebra","Mathematics","Science","Comics","Newspaper","UTS","Book of Eagle","The Lion King")
    var booksCannotBorrow = arrayListOf<String>("Almanac","Encyclopedia","No Submissions")
    println("------------List of Books--------------------")
    for (i in booksCanBarrow ) println(i)
        for (j in booksCannotBorrow) println(j)
    println("-------------Books You can Borrow:---------------")
    for (i in booksCanBarrow ){
        println(i)
    }
    println("------------------Books Not Available to Borrow-----------------:")
    for (i in booksCannotBorrow ){
        println(i)
    }

}

