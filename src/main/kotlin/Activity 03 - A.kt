var names = arrayListOf<String>(
    "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry","Joe","Johnny","Christian","Paul",
    "Earl","Ella","Justin","Cardo","Mark","Louie","Joshua","Cris","Lester","Eric")


fun main() {

    while (true) {
        print("[1]:Add Student\n[2]:Remove Student\n[3]:Search Student\n[4]:Count Student\n[5]:List Of Students\n[6]:Check Record Student\nEnter>>: ")
        var inputUser: Int = readln().toInt()
        if (inputUser == 1) {
            addStudent()
            continue
        } else if (inputUser == 2) {
            removeStudent()
            continue
        } else if (inputUser == 3) {
            print("Student Search: ")
            var name: String = readln()
            searchStudent(name)
            continue
        } else if (inputUser == 4) {
            countStudent()
            continue
        } else if (inputUser == 5) {
            showStudents()
            continue
        } else if (inputUser == 6) {
            print("Check record Enter Name: ")
            var name: String = readln()
            isStudentInRecord(name)
            continue
        } else println("Invalid Input!")
            break
    }
}
fun isStudentInRecord(name:String):Boolean{
    var counter = 0
    for (i in names) {
        if (name == i ) return true
        else  if (name != i) return false
    }
    println("$name Record is Found.")
    return true
}
fun addStudent(){
    print("Add Student: ")
    var addName : String = readln()
    names.add(addName)
    println("$addName is added.")
}
fun removeStudent(){
    print("Remove Student: ")
    var remove : String = readln()
    for (i in names) {
        if (remove == i){
            names.remove(remove)
            println("$remove is removed to our list.")
        }else println("Name Not Found.")
    }
}
fun countStudent(){
    println(names.size)
}
fun searchStudentWildSearch(name:String){
    print("Wild Search")
    for (i in names){
        if (name == i)
            println("$i is in the list of students.")
    }

}
fun searchStudentName(name:String){
    println("Search Student Name")
    for (i in names){
        if (name == i)
            println("$i is in the list of students.")
    }
}
fun searchStudent(name:String){
    if (name.length <= 3) {
        searchStudentWildSearch(name)
    }else if (name.length > 3) {
        searchStudentName(name)
    }else println("Invalid Input!")
}
fun showStudents(){
    for (i in names){
        println(i)
    }
}