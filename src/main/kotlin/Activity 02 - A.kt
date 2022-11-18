fun main(args: Array<String>) {
    println("-----------STUDENTS IN MD1P-----------")
    var students = arrayListOf<String>("Coco","Martin","Cardo")
    var progress = arrayListOf<String>("Complete","Incomplete","No Submissions")
    println("----Student Lists----")
    var counter = 1
    for (i in students ){
        println("$counter. $i")
    }
    println("----------PROGRESS TAKEN----------")
    println("${students[0]} = ${progress[0]}\n" +
            "${students[1]} = ${progress[1]}\n" +
            "${students[2]} = ${progress[2]}")

}