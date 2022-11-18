fun main() {

    var student = Students()
    while (true) {
        print("[1]:Search Student\n[2]:View Student\n[0]:Exit\nEnter>>: ")
        var inputUser: Int = readln().toInt()
        if (inputUser == 1) {
            print("Search Student: ")
            var name: String = readln()
            student.searchStudentWildSearch(name)

            continue
        } else if (inputUser == 2) {
            student.viewStudents()
            continue
        } else if (inputUser == 0) {
            println("Thank You.")
            break
        }



    }
}
class Students(){
    var firstName = arrayListOf<String>("John","Felix","Jonathan")
    var middleName = arrayListOf<String>("K","T","P")
    var lastName = arrayListOf<String>("Ambrosio","Sanchez","Racelis")
    var nickName = arrayListOf<String>("Ambo","Totoy","Athan")
    var id = arrayListOf<Int>(1,2,3)
    var yearEnrolled = arrayListOf<String>("06/22/2022","06/23/2022","06/24/2022")
    fun searchStudentWildSearch(name:String){

        for (i in firstName){
            if (name == i ) {
                println("$i Found in First Name Directory")
            }

        }
        for (i in middleName){
            if (name == i ) {
                println("$i Found in Middle Name Directory")
            }

        }
        for (i in lastName){
            if (name == i ) {
                println("$i Found in Last Name Directory")
            }

        }
        for (i in nickName){
            if (name == i ) {
                println("$i Found in Nick Name Directory")
            }

        }
        for (i in id){
            if (name.toInt() == i ) {
                println("$i Found in Id Directory")
            }

        }
        for (i in yearEnrolled){
            if (name == i ) {
                println("$i Found in year Enrolled Records")
            }

        }
        println("Thank you")

    }
    fun viewStudents(){
        var counter : Int = 0
        for (i in firstName){
            println("-----------------------------------------------")
            println("FullName: $i ${middleName[counter]}. ${lastName[counter]}\n" +
                    "NickName: ${nickName[counter]}\n" +
                    "Id: ${id[counter]}\n" +
                    "Year Enrolled: ${yearEnrolled[counter]}")
            counter++
        }
    }
}